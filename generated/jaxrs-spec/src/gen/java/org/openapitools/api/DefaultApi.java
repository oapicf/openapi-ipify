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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2018-08-10T05:21:53.044Z[GMT]")
public class DefaultApi {

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Get your public IP address", notes = "", response = Object.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "IP", response = Object.class)
    })
    public Response getIp(@QueryParam("format")   @ApiParam("Response format")  String format,@QueryParam("callback")   @ApiParam("JSONP callback function name")  String paramCallback) {
        return Response.ok().entity("magic!").build();
    }
}
