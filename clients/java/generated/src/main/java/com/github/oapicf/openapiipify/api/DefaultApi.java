/*
 * openapi-ipify
 * OpenAPI client for ipify, a simple public IP address API
 *
 * The version of the OpenAPI document: 5.3.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.oapicf.openapiipify.api;

import com.github.oapicf.openapiipify.ApiCallback;
import com.github.oapicf.openapiipify.ApiClient;
import com.github.oapicf.openapiipify.ApiException;
import com.github.oapicf.openapiipify.ApiResponse;
import com.github.oapicf.openapiipify.Configuration;
import com.github.oapicf.openapiipify.Pair;
import com.github.oapicf.openapiipify.ProgressRequestBody;
import com.github.oapicf.openapiipify.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DefaultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getIp
     * @param format Response format (optional)
     * @param paramCallback JSONP callback function name (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Your public IP address </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getIpCall(String format, String paramCallback, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (format != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("format", format));
        }

        if (paramCallback != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("callback", paramCallback));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "text/javascript",
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getIpValidateBeforeCall(String format, String paramCallback, final ApiCallback _callback) throws ApiException {
        return getIpCall(format, paramCallback, _callback);

    }

    /**
     * Get your public IP address
     * 
     * @param format Response format (optional)
     * @param paramCallback JSONP callback function name (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Your public IP address </td><td>  -  </td></tr>
     </table>
     */
    public String getIp(String format, String paramCallback) throws ApiException {
        ApiResponse<String> localVarResp = getIpWithHttpInfo(format, paramCallback);
        return localVarResp.getData();
    }

    /**
     * Get your public IP address
     * 
     * @param format Response format (optional)
     * @param paramCallback JSONP callback function name (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Your public IP address </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> getIpWithHttpInfo(String format, String paramCallback) throws ApiException {
        okhttp3.Call localVarCall = getIpValidateBeforeCall(format, paramCallback, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get your public IP address (asynchronously)
     * 
     * @param format Response format (optional)
     * @param paramCallback JSONP callback function name (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Your public IP address </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getIpAsync(String format, String paramCallback, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = getIpValidateBeforeCall(format, paramCallback, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
