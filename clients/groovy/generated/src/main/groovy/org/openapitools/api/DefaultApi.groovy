package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Ip
import org.openapitools.model.OneOfIpstring

class DefaultApi {
    String basePath = "https://api.ipify.org"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getIp ( String format, String paramCallback, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (format != null) {
            queryParams.put("format", format)
        }
        if (paramCallback != null) {
            queryParams.put("callback", paramCallback)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    OneOfIpstring.class )

    }

}
