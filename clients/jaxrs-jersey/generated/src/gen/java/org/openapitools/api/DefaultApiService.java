package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;


import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2025-11-30T07:59:45.164812746Z[Etc/UTC]", comments = "Generator version: 7.17.0")
public abstract class DefaultApiService {
    public abstract Response getIp(String format,String paramCallback,SecurityContext securityContext) throws NotFoundException;
}
