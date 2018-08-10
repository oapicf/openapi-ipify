#![allow(unused_imports, unused_qualifications, unused_extern_crates)]
extern crate chrono;
extern crate uuid;


use serde::ser::Serializer;

use std::collections::HashMap;
use models;
use swagger;


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct Ip {
    #[serde(rename = "ip")]
    pub ip: String,

}

impl Ip {
    pub fn new(ip: String, ) -> Ip {
        Ip {
            ip: ip,
        }
    }
}
