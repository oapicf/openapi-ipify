package org.openapitools.api;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("")
@Api(description = "the default API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-02T23:03:20.113505345Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class DefaultApi {

    @GET
    @Produces({ "text/plain", "application/javascript", "application/json" })
    @ApiOperation(value = "Get your public IP address", notes = "", response = String.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Your public IP address", response = String.class)
    })
    public Response getIp(@QueryParam("format")  @ApiParam("Response format")  String format,@QueryParam("callback")  @ApiParam("JSONP callback function name")  String paramCallback) {
        return Response.ok().entity("magic!").build();
    }
}
