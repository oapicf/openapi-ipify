# OAIDefaultApi

All URIs are relative to *https://api.ipify.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIp**](OAIDefaultApi.md#getip) | **GET** / | Get your public IP address


# **getIp**
```objc
-(NSURLSessionTask*) getIpWithFormat: (NSString*) format
    callback: (NSString*) callback
        completionHandler: (void (^)(OAIOneOfIpString* output, NSError* error)) handler;
```

Get your public IP address

### Example
```objc

NSString* format = @"format_example"; // Response format (optional)
NSString* callback = @"callback_example"; // JSONP callback function name (optional)

OAIDefaultApi*apiInstance = [[OAIDefaultApi alloc] init];

// Get your public IP address
[apiInstance getIpWithFormat:format
              callback:callback
          completionHandler: ^(OAIOneOfIpString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIDefaultApi->getIp: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **NSString***| Response format | [optional] 
 **callback** | **NSString***| JSONP callback function name | [optional] 

### Return type

[**OAIOneOfIpString***](OAIOneOfIpString.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

