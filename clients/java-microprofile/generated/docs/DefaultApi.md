# DefaultApi

All URIs are relative to *https://api64.ipify.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getIp**](DefaultApi.md#getIp) | **GET**  | Get your public IP address |



## getIp

> String getIp(format, paramCallback)

Get your public IP address

### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.models.*;
import org.openapitools.server.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api64.ipify.org");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String format = "json"; // String | Response format
        String paramCallback = "paramCallback_example"; // String | JSONP callback function name
        try {
            String result = apiInstance.getIp(format, paramCallback);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getIp");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

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

