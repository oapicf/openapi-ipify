# PSOpenAPITools.PSOpenAPITools/Api.DefaultApi

All URIs are relative to *https://api.ipify.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Get-Ip**](DefaultApi.md#Get-Ip) | **GET** / | Get your public IP address


<a name="Get-Ip"></a>
# **Get-Ip**
> OneOfIpstring Get-Ip<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Format] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Callback] <String><br>

Get your public IP address

### Example
```powershell
$Format = "json" # String | Response format (optional)
$Callback = "MyCallback" # String | JSONP callback function name (optional)

# Get your public IP address
try {
    $Result = Get-Ip -Format $Format -Callback $Callback
} catch {
    Write-Host ("Exception occurred when calling Get-Ip: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Format** | **String**| Response format | [optional] 
 **Callback** | **String**| JSONP callback function name | [optional] 

### Return type

[**OneOfIpstring**](OneOfIpstring.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

