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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-09-09T05:57:55.929336Z[Etc/UTC]")
public class DefaultApiControllerImp extends DefaultApiControllerImpInterface {
    @Override
    public Ip getIp(Http.Request request, String format, String paramCallback) throws Exception {
        //Do your magic!!!
        return new Ip();
    }

}
