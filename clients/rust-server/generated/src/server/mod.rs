use bytes::Bytes;
use futures::{future, future::BoxFuture, Stream, stream, future::FutureExt, stream::TryStreamExt};
use http_body_util::{combinators::BoxBody, Full};
use hyper::{body::{Body, Incoming}, HeaderMap, Request, Response, StatusCode};
use hyper::header::{HeaderName, HeaderValue, CONTENT_TYPE};
use log::warn;
#[allow(unused_imports)]
use std::convert::{TryFrom, TryInto};
use std::{convert::Infallible, error::Error};
use std::future::Future;
use std::marker::PhantomData;
use std::task::{Context, Poll};
use swagger::{ApiError, BodyExt, Has, RequestParser, XSpanIdString};
pub use swagger::auth::Authorization;
use swagger::auth::Scopes;
use url::form_urlencoded;

#[allow(unused_imports)]
use crate::{models, header, AuthenticationApi};

pub use crate::context;

type ServiceFuture = BoxFuture<'static, Result<Response<BoxBody<Bytes, Infallible>>, crate::ServiceError>>;

use crate::{Api,
     GetIpResponse
};

mod server_auth;

mod paths {
    use lazy_static::lazy_static;

    lazy_static! {
        pub static ref GLOBAL_REGEX_SET: regex::RegexSet = regex::RegexSet::new(vec![
            r"^/$"
        ])
        .expect("Unable to create global regex set");
    }
    pub(crate) static ID_: usize = 0;
}


pub struct MakeService<T, C>
where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString>  + Send + Sync + 'static
{
    api_impl: T,
    marker: PhantomData<C>,
}

impl<T, C> MakeService<T, C>
where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString>  + Send + Sync + 'static
{
    pub fn new(api_impl: T) -> Self {
        MakeService {
            api_impl,
            marker: PhantomData
        }
    }
}

impl<T, C> Clone for MakeService<T, C>
where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString>   + Send + Sync + 'static
{
    fn clone(&self) -> Self {
        Self {
            api_impl: self.api_impl.clone(),
            marker: PhantomData,
        }
    }
}

impl<T, C, Target> hyper::service::Service<Target> for MakeService<T, C>
where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString>  + Send + Sync + 'static
{
    type Response = Service<T, C>;
    type Error = crate::ServiceError;
    type Future = future::Ready<Result<Self::Response, Self::Error>>;

    fn call(&self, target: Target) -> Self::Future {
        let service = Service::new(self.api_impl.clone());

        future::ok(service)
    }
}

fn method_not_allowed() -> Result<Response<BoxBody<Bytes, Infallible>>, crate::ServiceError> {
    Ok(
        Response::builder().status(StatusCode::METHOD_NOT_ALLOWED)
            .body(BoxBody::new(http_body_util::Empty::new()))
            .expect("Unable to create Method Not Allowed response")
    )
}

pub struct Service<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString>  + Send + Sync + 'static
{
    api_impl: T,
    marker: PhantomData<C>,
}

impl<T, C> Service<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString>  + Send + Sync + 'static
{
    pub fn new(api_impl: T) -> Self {
        Service {
            api_impl,
            marker: PhantomData
        }
    }
}

impl<T, C> Clone for Service<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString>  + Send + Sync + 'static
{
    fn clone(&self) -> Self {
        Service {
            api_impl: self.api_impl.clone(),
            marker: self.marker,
        }
    }
}

#[allow(dead_code)]
fn body_from_string(s: String) -> BoxBody<Bytes, Infallible> {
    BoxBody::new(Full::new(Bytes::from(s)))
}

fn body_from_str(s: &str) -> BoxBody<Bytes, Infallible> {
    BoxBody::new(Full::new(Bytes::copy_from_slice(s.as_bytes())))
}

impl<T, C, ReqBody> hyper::service::Service<(Request<ReqBody>, C)> for Service<T, C> where
    T: Api<C> + Clone + Send + Sync + 'static,
    C: Has<XSpanIdString>  + Send + Sync + 'static,
    ReqBody: Body + Send + 'static,
    ReqBody::Error: Into<Box<dyn Error + Send + Sync>> + Send,
    ReqBody::Data: Send,
{
    type Response = Response<BoxBody<Bytes, Infallible>>;
    type Error = crate::ServiceError;
    type Future = ServiceFuture;

    fn call(&self, req: (Request<ReqBody>, C)) -> Self::Future {
        async fn run<T, C, ReqBody>(
            mut api_impl: T,
            req: (Request<ReqBody>, C),
        ) -> Result<Response<BoxBody<Bytes, Infallible>>, crate::ServiceError>
        where
            T: Api<C> + Clone + Send + 'static,
            C: Has<XSpanIdString>  + Send + Sync + 'static,
            ReqBody: Body + Send + 'static,
            ReqBody::Error: Into<Box<dyn Error + Send + Sync>> + Send,
            ReqBody::Data: Send,
        {
            let (request, context) = req;
            let (parts, body) = request.into_parts();
            let (method, uri, headers) = (parts.method, parts.uri, parts.headers);
            let path = paths::GLOBAL_REGEX_SET.matches(uri.path());

            match method {

            // GetIp - GET /
            hyper::Method::GET if path.matched(paths::ID_) => {
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_format = query_params.iter().filter(|e| e.0 == "format").map(|e| e.1.clone())
                    .next();
                let param_format = match param_format {
                    Some(param_format) => {
                        let param_format =
                            <models::GetIpFormatParameter as std::str::FromStr>::from_str
                                (&param_format);
                        match param_format {
                            Ok(param_format) => Some(param_format),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter format - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter format")),
                        }
                    },
                    None => None,
                };
                let param_callback = query_params.iter().filter(|e| e.0 == "callback").map(|e| e.1.clone())
                    .next();
                let param_callback = match param_callback {
                    Some(param_callback) => {
                        let param_callback =
                            <String as std::str::FromStr>::from_str
                                (&param_callback);
                        match param_callback {
                            Ok(param_callback) => Some(param_callback),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(body_from_string(format!("Couldn't parse query parameter callback - doesn't match schema: {e}")))
                                .expect("Unable to create Bad Request response for invalid query parameter callback")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.get_ip(
                                            param_format,
                                            param_callback,
                                        &context
                                    ).await;
                                let mut response = Response::new(BoxBody::new(http_body_util::Empty::new()));
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetIpResponse::YourPublicIPAddress
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_static("text/plain"));
                                                    // Plain text Body
                                                    *response.body_mut() = body_from_string(body);

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = body_from_str("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            _ if path.matched(paths::ID_) => method_not_allowed(),
                _ => Ok(Response::builder().status(StatusCode::NOT_FOUND)
                        .body(BoxBody::new(http_body_util::Empty::new()))
                        .expect("Unable to create Not Found response"))
            }
        }
        Box::pin(run(
            self.api_impl.clone(),
            req,
        ))
    }
}

/// Request parser for `Api`.
pub struct ApiRequestParser;
impl<T> RequestParser<T> for ApiRequestParser {
    fn parse_operation_id(request: &Request<T>) -> Option<&'static str> {
        let path = paths::GLOBAL_REGEX_SET.matches(request.uri().path());
        match *request.method() {
            // GetIp - GET /
            hyper::Method::GET if path.matched(paths::ID_) => Some("GetIp"),
            _ => None,
        }
    }
}
