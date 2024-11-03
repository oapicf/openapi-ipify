package org.openapitools.api;

import org.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("")


@io.swagger.annotations.Api(description = "the default API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-11-03T00:28:36.302035932Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public interface DefaultApi  {

    @GET
    
    
    @Produces({ "text/plain", "text/javascript", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get your public IP address", notes = "", response = String.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Your public IP address", response = String.class) })
    public Response getIp(, allowableValues="json, jsonp" @QueryParam("format") String format, @QueryParam("callback") String paramCallback,@Context SecurityContext securityContext);
}
