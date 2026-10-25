# DefaultAPI

All URIs are relative to *https://api64.ipify.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIp**](DefaultAPI.md#getip) | **GET** / | Get your public IP address


# **getIp**
```swift
    open class func getIp(format: Format_getIp? = nil, callback: String? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> String
```

Get your public IP address

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let format = "format_example" // String | Response format (optional)
let callback = "callback_example" // String | JSONP callback function name (optional)

// Get your public IP address
do {
    let response = try await DefaultAPI.getIp(format: format, callback: callback)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String** | Response format | [optional] 
 **callback** | **String** | JSONP callback function name | [optional] 

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, application/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

