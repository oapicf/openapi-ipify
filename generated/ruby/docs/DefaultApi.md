# OpenapiClient::DefaultApi

All URIs are relative to *https://api.ipify.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_ip**](DefaultApi.md#get_ip) | **GET** / | Get your public IP address


# **get_ip**
> Object get_ip(opts)

Get your public IP address

### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::DefaultApi.new
opts = {
  format: 'format_example', # String | Response format
  callback: 'callback_example' # String | JSONP callback function name
}

begin
  #Get your public IP address
  result = api_instance.get_ip(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling DefaultApi->get_ip: #{e}"
end
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



