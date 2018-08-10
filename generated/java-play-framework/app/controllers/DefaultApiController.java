package controllers;


import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import play.Configuration;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-08-10T05:21:29.403Z[GMT]")

public class DefaultApiController extends Controller {

    private final DefaultApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Configuration configuration;

    @Inject
    private DefaultApiController(Configuration configuration, DefaultApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }


    @ApiAction
    public Result getIp() throws Exception {
        String valueformat = request().getQueryString("format");
        String format;
        if (valueformat != null) {
            format = valueformat;
        } else {
            format = null;
        }
        String valueparamCallback = request().getQueryString("callback");
        String paramCallback;
        if (valueparamCallback != null) {
            paramCallback = valueparamCallback;
        } else {
            paramCallback = null;
        }
        Object obj = imp.getIp(format, paramCallback);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }
}
