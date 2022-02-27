# DefaultAPI

All URIs are relative to *https://api.ipify.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DefaultAPI_getIp**](DefaultAPI.md#DefaultAPI_getIp) | **GET** / | Get your public IP address


# **DefaultAPI_getIp**
```c
// Get your public IP address
//
one_of_ipstring_t* DefaultAPI_getIp(apiClient_t *apiClient, openapi_ipify_getIp_format_e format, char * callback);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**format** | **openapi_ipify_getIp_format_e** | Response format | [optional] 
**callback** | **char \*** | JSONP callback function name | [optional] 

### Return type

[one_of_ipstring_t](one_of_ipstring.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

