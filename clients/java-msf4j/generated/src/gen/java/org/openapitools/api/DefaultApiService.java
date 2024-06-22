package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.Ip;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-06-22T00:02:51.580717670Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public abstract class DefaultApiService {
    public abstract Response getIp(String format
 ,String paramCallback
 ) throws NotFoundException;
}
