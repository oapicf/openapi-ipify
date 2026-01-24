package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.GetIp200Response;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class DefaultApiImpl implements DefaultApi {
    public Future<ApiResponse<String>> getIp(String format, String paramCallback) {
        return Future.failedFuture(new HttpException(501));
    }

}
