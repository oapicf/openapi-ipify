# OpenAPI\Client\DefaultApi

All URIs are relative to *https://api.ipify.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIp**](DefaultApi.md#getIp) | **GET** / | Get your public IP address


# **getIp**
> object getIp($format, $callback)

Get your public IP address

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new OpenAPI\Client\Api\DefaultApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$format = 'format_example'; // string | Response format
$callback = 'callback_example'; // string | JSONP callback function name

try {
    $result = $apiInstance->getIp($format, $callback);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->getIp: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **string**| Response format | [optional]
 **callback** | **string**| JSONP callback function name | [optional]

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

