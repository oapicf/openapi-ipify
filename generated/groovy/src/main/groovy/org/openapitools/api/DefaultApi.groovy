package org.openapitools.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import org.openapitools.api.ApiUtils


import java.util.*;

@Mixin(ApiUtils)
class DefaultApi {
    String basePath = "https://api.ipify.org"
    String versionPath = "/api/v1"

    def getIp ( String format, String paramCallback, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        if (!"null".equals(String.valueOf(format)))
            queryParams.put("format", String.valueOf(format))

        if (!"null".equals(String.valueOf(paramCallback)))
            queryParams.put("callback", String.valueOf(paramCallback))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Object.class )

    }

}
