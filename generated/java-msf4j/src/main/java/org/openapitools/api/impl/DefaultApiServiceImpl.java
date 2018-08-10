package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2018-08-10T05:21:23.852Z[GMT]")
public class DefaultApiServiceImpl extends DefaultApiService {
    @Override
    public Response getIp(String format
, String paramCallback
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
