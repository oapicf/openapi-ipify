package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Ip;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.OneOfIpstring;

public final class DefaultApiException extends MainApiException {
    public DefaultApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final DefaultApiException Default_getIp_200_Exception = new DefaultApiException(200, "Your public IP address");
    

}