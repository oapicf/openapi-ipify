package org.openapitools.api;


import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;

/**
 * openapi-ipify
 *
 * <p>OpenAPI client for ipify, a simple public IP address API
 *
 */
@Path("")
@Api(value = "/", description = "")
public interface DefaultApi  {

    /**
     * Get your public IP address
     *
     */
    @GET
    
    @Produces({ "text/plain", "text/javascript", "application/javascript", "application/json" })
    @ApiOperation(value = "Get your public IP address", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Your public IP address", response = String.class) })
    public String getIp(@QueryParam("format") String format, @QueryParam("callback") String paramCallback);
}
