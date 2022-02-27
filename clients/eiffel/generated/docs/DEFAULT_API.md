# DEFAULT_API

All URIs are relative to *https://api.ipify.org*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**ip**](DEFAULT_API.md#ip) | **Get** / | Get your public IP address


# **ip**
> ip (format:  detachable STRING_32 ; callback:  detachable STRING_32 ): detachable ONE_OF_IPSTRING


Get your public IP address


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **STRING_32**| Response format | [optional] [default to null]
 **callback** | **STRING_32**| JSONP callback function name | [optional] [default to null]

### Return type

[**ONE_OF_IPSTRING**](oneOf&lt;Ip,string&gt;.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

