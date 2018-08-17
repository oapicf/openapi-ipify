# Org.OpenAPITools.Api.DefaultApi

All URIs are relative to *https://api.ipify.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetIp**](DefaultApi.md#getip) | **GET** / | Get your public IP address


<a name="getip"></a>
# **GetIp**
> Object GetIp (string format = null, string callback = null)

Get your public IP address

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetIpExample
    {
        public void main()
        {
            var apiInstance = new DefaultApi();
            var format = format_example;  // string | Response format (optional) 
            var callback = callback_example;  // string | JSONP callback function name (optional) 

            try
            {
                // Get your public IP address
                Object result = apiInstance.GetIp(format, callback);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.GetIp: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **string**| Response format | [optional] 
 **callback** | **string**| JSONP callback function name | [optional] 

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

