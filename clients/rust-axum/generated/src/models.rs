#![allow(unused_qualifications)]

use http::HeaderValue;
use validator::Validate;

#[cfg(feature = "server")]
use crate::header;
use crate::{models, types::*};

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct GetIpQueryParams {
            /// Response format
            /// Note: inline enums are not fully supported by openapi-generator
                #[serde(rename = "format")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub format: Option<String>,
            /// JSONP callback function name
                #[serde(rename = "callback")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub callback: Option<String>,
    }


