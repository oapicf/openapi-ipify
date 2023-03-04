/*
 * openapi-ipify
 *
 * OpenAPI client for ipify, a simple public IP address API
 *
 * OpenAPI document version: 3.3.1-pre.0
 * Maintained by: blah@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.handler;

import io.undertow.server.*;
import io.undertow.util.*;

import org.openapitools.model.*;

@SuppressWarnings("TooManyFunctions")
public interface PathHandlerInterface {

    /**
     * <p>Get your public IP address</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>format</b>"
     * <p>Response format</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>callback</b>"
     * <p>JSONP callback function name</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}, {mediaType=application/javascript}, {mediaType=text/plain}]</p>
     * <p><b>Returns</b>: {@link Ip}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Your public IP address</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getIp();
}
