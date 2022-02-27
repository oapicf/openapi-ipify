package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.DefaultApiService;
import org.openapitools.api.factories.DefaultApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Ip;
import org.openapitools.model.OneOfIpstring;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("")


@io.swagger.annotations.Api(description = "the default API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2022-02-27T09:34:27.329770Z[Etc/UTC]")
public class DefaultApi  {
   private final DefaultApiService delegate = DefaultApiServiceFactory.getDefaultApi();

    @GET
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get your public IP address", notes = "", response = OneOfIpstring.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Your public IP address", response = OneOfIpstring.class) })
    public Response getIp(@ApiParam(value = "Response format", allowableValues="json, jsonp") @QueryParam("format") String format
,@ApiParam(value = "JSONP callback function name") @QueryParam("callback") String paramCallback
)
    throws NotFoundException {
        return delegate.getIp(format,paramCallback);
    }
}
