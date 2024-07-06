package org.openapitools.api;

import org.openapitools.api.DefaultApiService;
import org.openapitools.api.factories.DefaultApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("")


@io.swagger.annotations.Api(description = "the default API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-07-06T02:22:32.262465993Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class DefaultApi  {
   private final DefaultApiService delegate;

   public DefaultApi(@Context ServletConfig servletContext) {
      DefaultApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("DefaultApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (DefaultApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = DefaultApiServiceFactory.getDefaultApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.GET
    
    
    @Produces({ "text/plain", "application/javascript", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get your public IP address", notes = "", response = String.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Your public IP address", response = String.class)
    })
    public Response getIp(@ApiParam(value = "Response format", allowableValues="json, jsonp") @QueryParam("format")  String format,@ApiParam(value = "JSONP callback function name") @QueryParam("callback")  String paramCallback,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getIp(format, paramCallback, securityContext);
    }
}
