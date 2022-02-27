# \DefaultApi

All URIs are relative to *https://api.ipify.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetIp**](DefaultApi.md#GetIp) | **Get** / | Get your public IP address



## GetIp

> OneOfIpstring GetIp(ctx, optional)

Get your public IP address

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***GetIpOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a GetIpOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **optional.String**| Response format | 
 **callback** | **optional.String**| JSONP callback function name | 

### Return type

[**OneOfIpstring**](oneOf&lt;Ip,string&gt;.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

