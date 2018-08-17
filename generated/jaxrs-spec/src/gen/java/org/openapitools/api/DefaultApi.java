package org.openapitools.api;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/default")
@Api(description = "the default API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2018-08-17T01:57:14.935Z[GMT]")
public class DefaultApi {

    @GET
    @Produces({ "*/*" })
    @ApiOperation(value = "Get your public IP address", notes = "", response = Object.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Your public IP address", response = Object.class)
    })
    public Response getIp(@QueryParam("format")   @ApiParam("Response format")  String format,@QueryParam("callback")   @ApiParam("JSONP callback function name")  String paramCallback) {
        return Response.ok().entity("magic!").build();
    }
}
