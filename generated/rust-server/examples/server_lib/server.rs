//! Server implementation of swagger_client.

#![allow(unused_imports)]

use futures::{self, Future};
use chrono;
use std::collections::HashMap;
use std::marker::PhantomData;

use swagger;
use swagger::{Has, XSpanIdString};

use swagger_client::{Api, ApiError,
                      GetIpResponse
};
use swagger_client::models;

#[derive(Copy, Clone)]
pub struct Server<C> {
    marker: PhantomData<C>,
}

impl<C> Server<C> {
    pub fn new() -> Self {
        Server{marker: PhantomData}
    }
}

impl<C> Api<C> for Server<C> where C: Has<XSpanIdString>{

    /// Get your public IP address
    fn get_ip(&self, format: Option<String>, callback: Option<String>, context: &C) -> Box<Future<Item=GetIpResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_ip({:?}, {:?}) - X-Span-ID: {:?}", format, callback, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

}
