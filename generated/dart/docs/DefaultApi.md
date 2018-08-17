# openapi.api.DefaultApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *https://api.ipify.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIp**](DefaultApi.md#getIp) | **GET** / | Get your public IP address


# **getIp**
> Object getIp(format, callback)

Get your public IP address

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new DefaultApi();
var format = format_example; // String | Response format
var callback = callback_example; // String | JSONP callback function name

try { 
    var result = api_instance.getIp(format, callback);
    print(result);
} catch (e) {
    print("Exception when calling DefaultApi->getIp: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Response format | [optional] 
 **callback** | **String**| JSONP callback function name | [optional] 

### Return type

[**Object**](Object.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

