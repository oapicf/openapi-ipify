<a name="__pageTop"></a>
# DefaultApi   { #DefaultApi }


All URIs are relative to *https://api64.ipify.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_ip**](#get_ip) | **GET** `/` | Get your public IP address

# **get_ip**   { #get_ip }
<a name="get_ip"></a>

> `get_ip(format = null,callback = null, on_success: Callable, on_failure: Callable)`

Get your public IP address



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.get_ip(
	# format: String   Eg: format_example
	# Response format
	format,
	# callback: String   Eg: callback_example
	# JSONP callback function name
	callback,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get_ip", response)
		assert(response.data is string)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```


### Authorization

No authorization required.

[[Back to top]](#__pageTop) \
[[Back to API list]](../README.md#documentation-for-api-endpoints) \
[[Back to Model list]](../README.md#documentation-for-models) \
[[Back to README]](../README.md) \

