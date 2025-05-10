# OpenApiIpifyClient::DefaultApi

All URIs are relative to *https://api.ipify.org*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**get_ip**](DefaultApi.md#get_ip) | **GET** / | Get your public IP address |


## get_ip

> String get_ip(opts)

Get your public IP address

### Examples

```ruby
require 'time'
require 'openapi_ipify'

api_instance = OpenApiIpifyClient::DefaultApi.new
opts = {
  format: 'json', # String | Response format
  callback: 'callback_example' # String | JSONP callback function name
}

begin
  # Get your public IP address
  result = api_instance.get_ip(opts)
  p result
rescue OpenApiIpifyClient::ApiError => e
  puts "Error when calling DefaultApi->get_ip: #{e}"
end
```

#### Using the get_ip_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> get_ip_with_http_info(opts)

```ruby
begin
  # Get your public IP address
  data, status_code, headers = api_instance.get_ip_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue OpenApiIpifyClient::ApiError => e
  puts "Error when calling DefaultApi->get_ip_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **format** | **String** | Response format | [optional] |
| **callback** | **String** | JSONP callback function name | [optional] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, text/javascript, application/json

