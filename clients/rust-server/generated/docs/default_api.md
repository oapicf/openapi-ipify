# default_api

All URIs are relative to *https://api.ipify.org*

Method | HTTP request | Description
------------- | ------------- | -------------
**getIp**](default_api.md#getIp) | **GET** / | Get your public IP address


# **getIp**
> swagger::OneOf2<models::Ip,String> getIp(optional)
Get your public IP address

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Response format | 
 **callback** | **String**| JSONP callback function name | 

### Return type

[**swagger::OneOf2<models::Ip,String>**](swagger::OneOf2<models::Ip,String>.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

