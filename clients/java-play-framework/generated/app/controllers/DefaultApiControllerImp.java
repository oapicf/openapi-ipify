package controllers;

import apimodels.Ip;
import apimodels.OneOfIpstring;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-02-27T09:34:49.231198Z[Etc/UTC]")
public class DefaultApiControllerImp extends DefaultApiControllerImpInterface {
    @Override
    public OneOfIpstring getIp(Http.Request request, String format, String paramCallback) throws Exception {
        //Do your magic!!!
        return new OneOfIpstring();
    }

}
