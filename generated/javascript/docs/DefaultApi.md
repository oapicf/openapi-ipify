# Ipify.DefaultApi

All URIs are relative to *https://api.ipify.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIp**](DefaultApi.md#getIp) | **GET** / | Get your public IP address


<a name="getIp"></a>
# **getIp**
> Object getIp(opts)

Get your public IP address

### Example
```javascript
var Ipify = require('ipify');

var apiInstance = new Ipify.DefaultApi();
var opts = {
  'format': "format_example", // String | Response format
  'callback': "callback_example" // String | JSONP callback function name
};
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getIp(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Response format | [optional] 
 **callback** | **String**| JSONP callback function name | [optional] 

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

