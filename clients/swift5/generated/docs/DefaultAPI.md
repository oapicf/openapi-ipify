# DefaultAPI

All URIs are relative to *https://api.ipify.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIp**](DefaultAPI.md#getip) | **GET** / | Get your public IP address


# **getIp**
```swift
    open class func getIp(format: Format_getIp? = nil, callback: String? = nil, completion: @escaping (_ data: GetIp200?, _ error: Error?) -> Void)
```

Get your public IP address

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let format = "format_example" // String | Response format (optional)
let callback = "callback_example" // String | JSONP callback function name (optional)

// Get your public IP address
DefaultAPI.getIp(format: format, callback: callback) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String** | Response format | [optional] 
 **callback** | **String** | JSONP callback function name | [optional] 

### Return type

[**GetIp200**](GetIp200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

