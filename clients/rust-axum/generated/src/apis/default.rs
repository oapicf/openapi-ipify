use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::{CookieJar, Host};
use bytes::Bytes;
use http::Method;
use serde::{Deserialize, Serialize};

use crate::{models, types::*};

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetIpResponse {
    /// Your public IP address
    Status200_YourPublicIPAddress
    (String)
}


/// Default
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Default<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// Get your public IP address.
    ///
    /// GetIp - GET /
    async fn get_ip(
    &self,
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::GetIpQueryParams,
    ) -> Result<GetIpResponse, E>;
}
