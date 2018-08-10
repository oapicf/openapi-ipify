# OpenAPI\Server\Api\DefaultApiInterface

All URIs are relative to *https://api.ipify.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIp**](DefaultApiInterface.md#getIp) | **GET** / | Get your public IP address


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.default:
        class: Acme\MyBundle\Api\DefaultApi
        tags:
            - { name: "open_apiserver.api", api: "default" }
    # ...
```

## **getIp**
> array getIp($format, $callback)

Get your public IP address

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/DefaultApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\DefaultApiInterface;

class DefaultApi implements DefaultApiInterface
{

    // ...

    /**
     * Implementation of DefaultApiInterface#getIp
     */
    public function getIp($format = null, $callback = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **string**| Response format | [optional]
 **callback** | **string**| JSONP callback function name | [optional]

### Return type

**array**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

