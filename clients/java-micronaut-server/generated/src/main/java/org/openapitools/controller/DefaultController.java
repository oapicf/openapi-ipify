/*
 * openapi-ipify
 * OpenAPI client for ipify, a simple public IP address API
 *
 * The version of the OpenAPI document: 1.0.0-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.controller;

import io.micronaut.http.annotation.*;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.core.convert.format.Format;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;
import reactor.core.publisher.Mono;
import org.openapitools.model.Ip;
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2022-03-05T23:35:29.347216Z[Etc/UTC]")
@Controller("${context-path}")
public class DefaultController {
    /**
     * Get your public IP address
     *
     * @param _format Response format (optional)
     * @param paramCallback JSONP callback function name (optional)
     * @return Ip
     */
    @ApiOperation(
        value = "Get your public IP address",
        nickname = "getIp",
        response = Ip.class,
        authorizations = {},
        tags={})
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Your public IP address", response = Ip.class)})
    @Get(uri="/")
    @Produces(value = {"application/json", "application/javascript", "text/plain"})
    @Secured(SecurityRule.IS_ANONYMOUS)
    public Mono<Ip> getIp(
        @QueryValue(value="format") @Nullable String _format, 
        @QueryValue(value="callback") @Nullable String paramCallback
    ) {
        // TODO implement getIp() body;
        Mono<Ip> result = Mono.empty();
        return result;
    }
}
