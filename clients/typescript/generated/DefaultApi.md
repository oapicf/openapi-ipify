# .DefaultApi

All URIs are relative to *https://api.ipify.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIp**](DefaultApi.md#getIp) | **GET** / | Get your public IP address


# **getIp**
> Ip getIp()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DefaultApi(configuration);

let body:.DefaultApiGetIpRequest = {
  // 'json' | 'jsonp' | Response format (optional)
  format: "json",
  // string | JSONP callback function name (optional)
  callback: "callback_example",
};

apiInstance.getIp(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | [**&#39;json&#39; | &#39;jsonp&#39;**]**Array<&#39;json&#39; &#124; &#39;jsonp&#39;>** | Response format | (optional) defaults to undefined
 **callback** | [**string**] | JSONP callback function name | (optional) defaults to undefined


### Return type

**Ip**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/javascript, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Your public IP address |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


