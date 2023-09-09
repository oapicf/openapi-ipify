package org.openapitools.api.factories;

import org.openapitools.api.DefaultApiService;
import org.openapitools.api.impl.DefaultApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2023-09-09T05:58:17.742989Z[Etc/UTC]")
public class DefaultApiServiceFactory {
    private static final DefaultApiService service = new DefaultApiServiceImpl();

    public static DefaultApiService getDefaultApi() {
        return service;
    }
}
