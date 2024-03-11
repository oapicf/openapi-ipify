package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.Ip;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-11T07:46:42.544086061Z[Etc/UTC]")
public interface DefaultApiService {
      Response getIp(String format,String paramCallback,SecurityContext securityContext)
      throws NotFoundException;
}
