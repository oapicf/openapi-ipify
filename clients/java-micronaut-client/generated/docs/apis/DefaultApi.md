# DefaultApi

All URIs are relative to *https://api.ipify.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getIp**](DefaultApi.md#getIp) | **GET** / | Get your public IP address |


## Creating DefaultApi

To initiate an instance of `DefaultApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.DefaultApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(DefaultApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    DefaultApi defaultApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="getIp"></a>
# **getIp**
```java
Mono<String> DefaultApi.getIp(_formatparamCallback)
```

Get your public IP address

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_format** | `String`| Response format | [optional parameter] [enum: `json`, `jsonp`] |
| **paramCallback** | `String`| JSONP callback function name | [optional parameter] |


### Return type
`String`



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `text/plain`, `text/javascript`, `application/json`

