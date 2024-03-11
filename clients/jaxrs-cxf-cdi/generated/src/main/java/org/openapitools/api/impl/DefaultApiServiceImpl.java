package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import org.openapitools.model.Ip;

import java.util.List;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-03-11T07:46:36.835781338Z[Etc/UTC]")
public class DefaultApiServiceImpl implements DefaultApiService {
      @Override
      public Response getIp(String format, String paramCallback, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}
