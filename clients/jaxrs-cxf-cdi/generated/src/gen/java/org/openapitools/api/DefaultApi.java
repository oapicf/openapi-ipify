package org.openapitools.api;

import org.openapitools.model.Ip;
import org.openapitools.model.OneOfIpstring;
import org.openapitools.api.DefaultApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.PATCH;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("")
@RequestScoped

@Api(description = "the default API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2022-03-05T05:31:47.135611Z[Etc/UTC]")

public class DefaultApi  {

  @Context SecurityContext securityContext;

  @Inject DefaultApiService delegate;


    @GET
    
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Get your public IP address", notes = "", response = OneOfIpstring.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Your public IP address", response = OneOfIpstring.class) })
    public Response getIp(@ApiParam(value = "Response format", allowableValues="json, jsonp")  @QueryParam("format") String format, @ApiParam(value = "JSONP callback function name")  @QueryParam("callback") String paramCallback) {
        return delegate.getIp(format, paramCallback, securityContext);
    }
}
