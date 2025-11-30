# DefaultApi

All URIs are relative to *https://api64.ipify.org*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**getIp**](#getip) | **GET** / | Get your public IP address|

# **getIp**
> string getIp()


### Example

```typescript
import {
    DefaultApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new DefaultApi(configuration);

let format: 'json' | 'jsonp'; //Response format (optional) (default to undefined)
let callback: string; //JSONP callback function name (optional) (default to undefined)

const { status, data } = await apiInstance.getIp(
    format,
    callback
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **format** | [**&#39;json&#39; | &#39;jsonp&#39;**]**Array<&#39;json&#39; &#124; &#39;jsonp&#39;>** | Response format | (optional) defaults to undefined|
| **callback** | [**string**] | JSONP callback function name | (optional) defaults to undefined|


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
|**200** | Your public IP address |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

