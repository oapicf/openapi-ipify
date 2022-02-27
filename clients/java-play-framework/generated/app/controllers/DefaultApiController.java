package controllers;

import apimodels.Ip;
import apimodels.OneOfIpstring;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-02-27T09:34:49.231198Z[Etc/UTC]")
public class DefaultApiController extends Controller {
    private final DefaultApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private DefaultApiController(Config configuration, DefaultApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result getIp(Http.Request request) throws Exception {
        String valueformat = request.getQueryString("format");
        String format;
        if (valueformat != null) {
            format = valueformat;
        } else {
            format = null;
        }
        String valueparamCallback = request.getQueryString("callback");
        String paramCallback;
        if (valueparamCallback != null) {
            paramCallback = valueparamCallback;
        } else {
            paramCallback = null;
        }
        return imp.getIpHttp(request, format, paramCallback);
    }

}
