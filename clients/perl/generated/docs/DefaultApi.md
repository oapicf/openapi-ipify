# WWW::OpenAPIClient::DefaultApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::DefaultApi;
```

All URIs are relative to *https://api.ipify.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_ip**](DefaultApi.md#get_ip) | **GET** / | Get your public IP address


# **get_ip**
> string get_ip(format => $format, callback => $callback)

Get your public IP address

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::DefaultApi;
my $api_instance = WWW::OpenAPIClient::DefaultApi->new(
);

my $format = "format_example"; # string | Response format
my $callback = "callback_example"; # string | JSONP callback function name

eval {
    my $result = $api_instance->get_ip(format => $format, callback => $callback);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling DefaultApi->get_ip: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **string**| Response format | [optional] 
 **callback** | **string**| JSONP callback function name | [optional] 

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, text/javascript, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

