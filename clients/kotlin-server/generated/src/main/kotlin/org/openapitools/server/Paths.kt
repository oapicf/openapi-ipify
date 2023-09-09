/**
* openapi-ipify
* OpenAPI client for ipify, a simple public IP address API
*
* The version of the OpenAPI document: 4.0.1-pre.0
* Contact: blah@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server

import io.ktor.resources.*
import kotlinx.serialization.*
import org.openapitools.server.models.*

object Paths {
    /**
     * Get your public IP address
     * 
     * @param format Response format (optional)
     * @param paramCallback JSONP callback function name (optional)
     */
    @Serializable @Resource("/") class getIp(val format: kotlin.String? = null, val paramCallback: kotlin.String? = null)

}
