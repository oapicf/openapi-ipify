# .DefaultApi

All URIs are relative to *https://api64.ipify.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIp**](DefaultApi.md#getIp) | **GET** / | Get your public IP address


# **getIp**
> string getIp()


### Example


```typescript
import { createConfiguration, DefaultApi } from '';
import type { DefaultApiGetIpRequest } from '';

const configuration = createConfiguration();
const apiInstance = new DefaultApi(configuration);

const request: DefaultApiGetIpRequest = {
    // Response format (optional)
  format: "json",
    // JSONP callback function name (optional)
  callback: "callback_example",
};

const data = await apiInstance.getIp(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | [**&#39;json&#39; | &#39;jsonp&#39;**]**Array<&#39;json&#39; &#124; &#39;jsonp&#39;>** | Response format | (optional) defaults to undefined
 **callback** | [**string**] | JSONP callback function name | (optional) defaults to undefined


### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, application/javascript


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Your public IP address |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


