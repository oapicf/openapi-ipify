# \DefaultApi

All URIs are relative to *https://api.ipify.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetIp**](DefaultApi.md#GetIp) | **Get** / | Get your public IP address



## GetIp

> OneOfIpstring GetIp(ctx).Format(format).Callback(callback).Execute()

Get your public IP address

### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    format := "format_example" // string | Response format (optional)
    callback := "callback_example" // string | JSONP callback function name (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DefaultApi.GetIp(context.Background()).Format(format).Callback(callback).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DefaultApi.GetIp``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetIp`: OneOfIpstring
    fmt.Fprintf(os.Stdout, "Response from `DefaultApi.GetIp`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetIpRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **string** | Response format | 
 **callback** | **string** | JSONP callback function name | 

### Return type

[**OneOfIpstring**](oneOf&lt;Ip,string&gt;.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

