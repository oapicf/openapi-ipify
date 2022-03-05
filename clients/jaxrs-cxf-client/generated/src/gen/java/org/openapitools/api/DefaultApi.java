package org.openapitools.api;

import org.openapitools.model.Ip;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
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
    
    @Produces({ "application/json", "application/javascript", "text/plain" })
    @ApiOperation(value = "Get your public IP address", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Your public IP address", response = Ip.class) })
    public Ip getIp(@QueryParam("format") String format, @QueryParam("callback") String paramCallback);
}
