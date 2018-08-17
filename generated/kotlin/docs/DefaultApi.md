# DefaultApi

All URIs are relative to *https://api.ipify.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIp**](DefaultApi.md#getIp) | **GET** / | Get your public IP address


<a name="getIp"></a>
# **getIp**
> kotlin.Any getIp(format, callback)

Get your public IP address

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val format : kotlin.String = format_example // kotlin.String | Response format
val callback : kotlin.String = callback_example // kotlin.String | JSONP callback function name
try {
    val result : kotlin.Any = apiInstance.getIp(format, callback)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getIp")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getIp")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **kotlin.String**| Response format | [optional] [enum: json, jsonp]
 **callback** | **kotlin.String**| JSONP callback function name | [optional]

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

