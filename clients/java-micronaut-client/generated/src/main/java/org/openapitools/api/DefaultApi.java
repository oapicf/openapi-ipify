/*
 * openapi-ipify
 * OpenAPI client for ipify, a simple public IP address API
 *
 * The version of the OpenAPI document: 5.2.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.api;

import io.micronaut.http.annotation.*;
import io.micronaut.core.annotation.*;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.core.convert.format.Format;
import reactor.core.publisher.Mono;
import org.openapitools.model.Ip;
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-06-22T00:02:43.790599706Z[Etc/UTC]", comments = "Generator version: 7.6.0")
@Client("${openapi-micronaut-client-base-path}")
public interface DefaultApi {
    /**
     * Get your public IP address
     *
     * @param _format Response format (optional)
     * @param paramCallback JSONP callback function name (optional)
     * @return Ip
     */
    @Get(uri="/")
    @Consumes({"application/json", "application/javascript", "text/plain"})
    Mono<Ip> getIp(
        @QueryValue(value="format") @Nullable String _format, 
        @QueryValue(value="callback") @Nullable String paramCallback
    );

}
