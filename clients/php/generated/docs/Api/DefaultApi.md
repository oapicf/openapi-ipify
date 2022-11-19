# OpenAPI\Client\DefaultApi

All URIs are relative to https://api.ipify.org, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getIp()**](DefaultApi.md#getIp) | **GET** / | Get your public IP address |


## `getIp()`

```php
getIp($format, $callback): \OpenAPI\Client\Model\Ip
```

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
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **format** | **string**| Response format | [optional] |
| **callback** | **string**| JSONP callback function name | [optional] |

### Return type

[**\OpenAPI\Client\Model\Ip**](../Model/Ip.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`, `application/javascript`, `text/plain`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
