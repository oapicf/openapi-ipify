# DefaultApi

All URIs are relative to *https://api64.ipify.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIp**](DefaultApi.md#getIp) | **Get** / | Get your public IP address


<a name="getIp"></a>
# **getIp**
> kotlin.String getIp(format, paramCallback)

Get your public IP address

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = DefaultApi()
val format : kotlin.String = format_example // kotlin.String | Response format
val paramCallback : kotlin.String = paramCallback_example // kotlin.String | JSONP callback function name
try {
    val result : kotlin.String = apiInstance.getIp(format, paramCallback)
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
 **paramCallback** | **kotlin.String**| JSONP callback function name | [optional]

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: TEXT_PLAIN_UTF8, APPLICATION_JSON, APPLICATION_JAVASCRIPT

