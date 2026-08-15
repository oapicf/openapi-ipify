package org.openapitools.api;

import org.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.GetIp200Response;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-15T01:57:46.313350535Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public interface DefaultApi  {

    @GET
    
    
    @Produces({ "text/plain", "application/json", "application/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get your public IP address", notes = "", response = String.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Your public IP address", response = String.class) })
    public Response getIp(, allowableValues="json, jsonp" @QueryParam("format") String format, @QueryParam("callback") String paramCallback,@Context SecurityContext securityContext);
}
