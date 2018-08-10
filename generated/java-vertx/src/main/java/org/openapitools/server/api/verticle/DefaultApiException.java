package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class DefaultApiException extends MainApiException {
    public DefaultApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    

}