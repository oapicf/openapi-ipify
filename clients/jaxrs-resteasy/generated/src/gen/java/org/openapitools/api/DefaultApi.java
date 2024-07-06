package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.DefaultApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("")


@io.swagger.annotations.Api(description = "the default API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-07-06T02:22:34.835130769Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class DefaultApi  {

    @Inject DefaultApiService service;

    @GET
    
    
    @Produces({ "text/plain", "application/javascript", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get your public IP address", notes = "", response = String.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Your public IP address", response = String.class) })
    public Response getIp(, allowableValues="json, jsonp" @QueryParam("format") String format, @QueryParam("callback") String paramCallback,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getIp(format,paramCallback,securityContext);
    }
}
