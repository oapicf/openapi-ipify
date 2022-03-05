# DefaultApi

All URIs are relative to *https://api.ipify.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIp**](DefaultApi.md#getIp) | **GET** / | Get your public IP address



## getIp

> Ip getIp(format, callback)

Get your public IP address

### Example

```java
// Import classes:
//import org.openapitools.client.api.DefaultApi;

DefaultApi apiInstance = new DefaultApi();
String format = null; // String | Response format
String callback = null; // String | JSONP callback function name
try {
    Ip result = apiInstance.getIp(format, callback);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getIp");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Response format | [optional] [default to null] [enum: json, jsonp]
 **callback** | **String**| JSONP callback function name | [optional] [default to null]

### Return type

[**Ip**](Ip.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/javascript, text/plain

