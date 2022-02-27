# DefaultApi

All URIs are relative to *https://api.ipify.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetIp**](DefaultApi.md#GetIp) | **GET** / | Get your public IP address


# **GetIp**
> OneOfIpstring GetIp(format=var.format, callback=var.callback)

Get your public IP address

### Example
```R
library(openapi)

var.format <- 'format_example' # character | Response format
var.callback <- 'callback_example' # character | JSONP callback function name

#Get your public IP address
api.instance <- DefaultApi$new()
result <- api.instance$GetIp(format=var.format, callback=var.callback)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | Enum [json, jsonp] | Response format | [optional] 
 **callback** | **character**| JSONP callback function name | [optional] 

### Return type

[**OneOfIpstring**](oneOf&lt;Ip,string&gt;.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Your public IP address |  -  |

