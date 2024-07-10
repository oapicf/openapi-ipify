package org.openapitools.api;

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
import javax.validation.Valid;
@Path("")
@RequestScoped

@Api(description = "the default API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-07-09T23:55:48.700867612Z[Etc/UTC]", comments = "Generator version: 7.6.0")

public class DefaultApi  {

  @Context SecurityContext securityContext;

  @Inject DefaultApiService delegate;


    @GET
    
    
    @Produces({ "text/plain", "application/javascript", "application/json" })
    @ApiOperation(value = "Get your public IP address", notes = "", response = String.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Your public IP address", response = String.class) })
    public Response getIp(@ApiParam(value = "Response format", allowableValues="json, jsonp")  @QueryParam("format") String format, @ApiParam(value = "JSONP callback function name")  @QueryParam("callback") String paramCallback) {
        return delegate.getIp(format, paramCallback, securityContext);
    }
}
