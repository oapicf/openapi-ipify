# DefaultApi

All URIs are relative to *https://api64.ipify.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getIp**](DefaultApi.md#getIp) | **GET**  | Get your public IP address |



## getIp

> String getIp(format, paramCallback)

Get your public IP address

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **format** | **String**| Response format | [optional] [enum: json, jsonp] |
| **paramCallback** | **String**| JSONP callback function name | [optional] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, application/javascript


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Your public IP address |  -  |

