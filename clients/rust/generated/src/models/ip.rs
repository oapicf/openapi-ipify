/*
 * openapi-ipify
 *
 * OpenAPI client for ipify, a simple public IP address API
 *
 * The version of the OpenAPI document: 5.2.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct Ip {
    #[serde(rename = "ip")]
    pub ip: String,
}

impl Ip {
    pub fn new(ip: String) -> Ip {
        Ip {
            ip,
        }
    }
}

