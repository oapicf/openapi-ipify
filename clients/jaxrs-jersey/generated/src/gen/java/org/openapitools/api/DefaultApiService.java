package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.GetIp200Response;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-14T10:53:40.727590195Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public abstract class DefaultApiService {
    public abstract Response getIp(String format,String paramCallback,SecurityContext securityContext) throws NotFoundException;
}
