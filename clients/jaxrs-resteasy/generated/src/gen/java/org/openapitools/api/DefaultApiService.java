package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.Ip;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-11-19T01:28:48.807454Z[Etc/UTC]")
public interface DefaultApiService {
      Response getIp(String format,String paramCallback,SecurityContext securityContext)
      throws NotFoundException;
}
