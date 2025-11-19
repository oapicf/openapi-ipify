# OpenapiIpify.DefaultApi

All URIs are relative to *https://api64.ipify.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIp**](DefaultApi.md#getIp) | **GET** / | Get your public IP address



## getIp

> String getIp(opts)

Get your public IP address

### Example

```javascript
import OpenapiIpify from 'openapi_ipify';

let apiInstance = new OpenapiIpify.DefaultApi();
let opts = {
  'format': "format_example", // String | Response format
  'callback': "callback_example" // String | JSONP callback function name
};
apiInstance.getIp(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Response format | [optional] 
 **callback** | **String**| JSONP callback function name | [optional] 

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, text/javascript, application/javascript, application/json

