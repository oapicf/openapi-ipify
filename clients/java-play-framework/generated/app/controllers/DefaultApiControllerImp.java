package controllers;

import apimodels.Ip;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-01-07T07:45:42.539855972Z[Etc/UTC]")
public class DefaultApiControllerImp extends DefaultApiControllerImpInterface {
    @Override
    public Ip getIp(Http.Request request, String format, String paramCallback) throws Exception {
        //Do your magic!!!
        return new Ip();
    }

}
