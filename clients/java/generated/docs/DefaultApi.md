# DefaultApi

All URIs are relative to *https://api.ipify.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIp**](DefaultApi.md#getIp) | **GET** / | Get your public IP address


<a name="getIp"></a>
# **getIp**
> OneOfIpstring getIp(format, paramCallback)

Get your public IP address

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ipify.org");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String format = "json"; // String | Response format
    String paramCallback = "paramCallback_example"; // String | JSONP callback function name
    try {
      OneOfIpstring result = apiInstance.getIp(format, paramCallback);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Response format | [optional] [enum: json, jsonp]
 **paramCallback** | **String**| JSONP callback function name | [optional]

### Return type

[**OneOfIpstring**](OneOfIpstring.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Your public IP address |  -  |

