# DefaultApi

All URIs are relative to *https://api.ipify.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIp**](DefaultApi.md#getIp) | **GET** / | Get your public IP address


<a name="getIp"></a>
# **getIp**
> Object getIp(format, callback)

Get your public IP address

### Example
```java
// Import classes:
//import org.openapitools.client.api.DefaultApi;

DefaultApi apiInstance = new DefaultApi();
String format = "format_example"; // String | Response format
String callback = "callback_example"; // String | JSONP callback function name
try {
    Object result = apiInstance.getIp(format, callback);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getIp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Response format | [optional] [enum: json, jsonp]
 **callback** | **String**| JSONP callback function name | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

