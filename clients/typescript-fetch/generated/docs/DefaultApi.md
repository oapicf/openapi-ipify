# DefaultApi

All URIs are relative to *https://api64.ipify.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getIp**](DefaultApi.md#getip) | **GET** / | Get your public IP address |



## getIp

> string getIp(format, callback)

Get your public IP address

### Example

```ts
import {
  Configuration,
  DefaultApi,
} from '';
import type { GetIpRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new DefaultApi();

  const body = {
    // 'json' | 'jsonp' | Response format (optional)
    format: format_example,
    // string | JSONP callback function name (optional)
    callback: callback_example,
  } satisfies GetIpRequest;

  try {
    const data = await api.getIp(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **format** | `json`, `jsonp` | Response format | [Optional] [Defaults to `undefined`] [Enum: json, jsonp] |
| **callback** | `string` | JSONP callback function name | [Optional] [Defaults to `undefined`] |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `text/plain`, `application/json`, `application/javascript`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Your public IP address |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

