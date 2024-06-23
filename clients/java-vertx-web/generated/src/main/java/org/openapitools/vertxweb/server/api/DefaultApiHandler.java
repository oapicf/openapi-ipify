package org.openapitools.vertxweb.server.api;


import com.fasterxml.jackson.core.type.TypeReference;
import io.vertx.core.json.jackson.DatabindCodec;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.validation.RequestParameters;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.validation.ValidationHandler;
import io.vertx.ext.web.RoutingContext;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class DefaultApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(DefaultApiHandler.class);

    private final DefaultApi api;

    public DefaultApiHandler(DefaultApi api) {
        this.api = api;
    }

    @Deprecated
    public DefaultApiHandler() {
        this(new DefaultApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("getIp").handler(this::getIp);
    }

    private void getIp(RoutingContext routingContext) {
        logger.info("getIp()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String format = requestParameters.queryParameter("format") != null ? requestParameters.queryParameter("format").getString() : null;
        String paramCallback = requestParameters.queryParameter("callback") != null ? requestParameters.queryParameter("callback").getString() : null;

        logger.debug("Parameter format is {}", format);
        logger.debug("Parameter paramCallback is {}", paramCallback);

        api.getIp(format, paramCallback)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

}
