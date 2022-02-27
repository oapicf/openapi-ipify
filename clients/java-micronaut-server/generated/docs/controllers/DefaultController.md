# DefaultController

All URIs are relative to `""`

The controller class is defined in **[DefaultController.java](../../src/main/java/org/openapitools/controller/DefaultController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIp**](#getIp) | **GET** / | Get your public IP address

<a name="getIp"></a>
# **getIp**
```java
Mono<OneOfIpstring> DefaultController.getIp(_formatparamCallback)
```

Get your public IP address

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**_format** | `String` | Response format | [optional parameter] [enum: `json`, `jsonp`]
**paramCallback** | `String` | JSONP callback function name | [optional parameter]

### Return type
[**OneOfIpstring**](../../docs/models/OneOfIpstring.md)


### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: Not defined

