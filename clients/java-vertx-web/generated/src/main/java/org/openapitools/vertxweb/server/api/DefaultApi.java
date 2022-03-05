package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Ip;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface DefaultApi  {
    Future<ApiResponse<Ip>> getIp(String format, String paramCallback);
}
