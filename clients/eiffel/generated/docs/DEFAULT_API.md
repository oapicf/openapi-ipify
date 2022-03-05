# DEFAULT_API

All URIs are relative to *https://api.ipify.org*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**ip**](DEFAULT_API.md#ip) | **Get** / | Get your public IP address


# **ip**
> ip (format:  detachable STRING_32 ; callback:  detachable STRING_32 ): detachable IP


Get your public IP address


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **STRING_32**| Response format | [optional] [default to null]
 **callback** | **STRING_32**| JSONP callback function name | [optional] [default to null]

### Return type

[**IP**](Ip.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/javascript, text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

