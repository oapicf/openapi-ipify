# openapi_client.DefaultApi

All URIs are relative to *https://api.ipify.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_ip**](DefaultApi.md#get_ip) | **GET** / | Get your public IP address


# **get_ip**
> object get_ip(format=format, param_callback=param_callback)

Get your public IP address

### Example
```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = openapi_client.DefaultApi()
format = 'format_example' # str | Response format (optional)
param_callback = 'param_callback_example' # str | JSONP callback function name (optional)

try:
    # Get your public IP address
    api_response = api_instance.get_ip(format=format, param_callback=param_callback)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->get_ip: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Response format | [optional] 
 **param_callback** | **str**| JSONP callback function name | [optional] 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

