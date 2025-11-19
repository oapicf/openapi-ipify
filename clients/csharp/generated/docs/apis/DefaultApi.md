# Org.OpenAPITools.Api.DefaultApi

All URIs are relative to *https://api64.ipify.org*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GetIp**](DefaultApi.md#getip) | **GET** / | Get your public IP address |

<a id="getip"></a>
# **GetIp**
> string GetIp (string format = null, string callback = null)

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
            Configuration config = new Configuration();
            config.BasePath = "https://api64.ipify.org";
            var apiInstance = new DefaultApi(config);
            var format = "json";  // string | Response format (optional) 
            var callback = "callback_example";  // string | JSONP callback function name (optional) 

            try
            {
                // Get your public IP address
                string result = apiInstance.GetIp(format, callback);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DefaultApi.GetIp: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetIpWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get your public IP address
    ApiResponse<string> response = apiInstance.GetIpWithHttpInfo(format, callback);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DefaultApi.GetIpWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **format** | **string** | Response format | [optional]  |
| **callback** | **string** | JSONP callback function name | [optional]  |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, text/javascript, application/javascript, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Your public IP address |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

