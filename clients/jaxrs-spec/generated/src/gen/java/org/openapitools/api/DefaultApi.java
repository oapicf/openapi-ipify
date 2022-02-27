package org.openapitools.api;

import org.openapitools.model.Ip;
import org.openapitools.model.OneOfIpstring;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("")
@Api(description = "the default API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-02-27T09:35:52.911002Z[Etc/UTC]")public class DefaultApi {

    @GET
    @Produces({ "*/*" })
    @ApiOperation(value = "Get your public IP address", notes = "", response = OneOfIpstring.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Your public IP address", response = OneOfIpstring.class)
    })
    public Response getIp(@QueryParam("format")  @ApiParam("Response format")  String format,@QueryParam("callback")  @ApiParam("JSONP callback function name")  String paramCallback) {
        return Response.ok().entity("magic!").build();
    }
}
