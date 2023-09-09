# openapiipify.DefaultApi

All URIs are relative to *https://api.ipify.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_ip**](DefaultApi.md#get_ip) | **GET** / | Get your public IP address


# **get_ip**
> Ip get_ip(format=format, param_callback=param_callback)

Get your public IP address

### Example

```python
import time
import os
import openapiipify
from openapiipify.models.ip import Ip
from openapiipify.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.ipify.org
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiipify.Configuration(
    host = "https://api.ipify.org"
)


# Enter a context with an instance of the API client
with openapiipify.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiipify.DefaultApi(api_client)
    format = 'format_example' # str | Response format (optional)
    param_callback = 'param_callback_example' # str | JSONP callback function name (optional)

    try:
        # Get your public IP address
        api_response = api_instance.get_ip(format=format, param_callback=param_callback)
        print("The response of DefaultApi->get_ip:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_ip: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **str**| Response format | [optional] 
 **param_callback** | **str**| JSONP callback function name | [optional] 

### Return type

[**Ip**](Ip.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/javascript, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Your public IP address |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

