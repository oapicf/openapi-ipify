/// mime types for requests and responses

pub mod responses {
    use hyper::mime::*;

    // The macro is called per-operation to beat the recursion limit
    /// Create Mime objects for the response content types for GetIp
    lazy_static! {
        pub static ref GET_IP_IP: Mime = "application/json".parse().unwrap();
    }

}

pub mod requests {
    use hyper::mime::*;

}
