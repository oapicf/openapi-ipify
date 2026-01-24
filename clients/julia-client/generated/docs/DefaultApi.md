# DefaultApi

All URIs are relative to *https://api64.ipify.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_ip**](DefaultApi.md#get_ip) | **GET** / | Get your public IP address


# **get_ip**
> `get_ip`(_api::`DefaultApi`; `format`=nothing, `callback`=nothing, _mediaType=nothing) -> `String`, `OpenAPI.Clients.ApiResponse` <br/>
> `get_ip`(_api::`DefaultApi`, response_stream::`Channel`; `format`=nothing, `callback`=nothing, _mediaType=nothing) -> `Channel`{ `String` }, `OpenAPI.Clients.ApiResponse`

Get your public IP address

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`DefaultApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`format`** | **`String`** | Response format | [default to nothing]
 **`callback`** | **`String`** | JSONP callback function name | [default to nothing]

### Return type

**`String`**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, application/javascript

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

