package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;



import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2018-08-17T01:57:10.193Z[GMT]")
public class DefaultApiServiceImpl implements DefaultApiService {
      public Response getIp(String format,String paramCallback,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
