# Org.OpenAPITools.Api.DefaultApi

All URIs are relative to *https://api.ipify.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetIp**](DefaultApi.md#getip) | **GET** / | Get your public IP address



## GetIp

> Ip GetIp (string format = null, string callback = null)

Get your public IP address

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetIpExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://api.ipify.org";
            var apiInstance = new DefaultApi(Configuration.Default);
            var format = "json";  // string | Response format (optional) 
            var callback = "callback_example";  // string | JSONP callback function name (optional) 

            try
            {
                // Get your public IP address
                Ip result = apiInstance.GetIp(format, callback);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling DefaultApi.GetIp: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
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

[**Ip**](Ip.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/javascript, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Your public IP address |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

