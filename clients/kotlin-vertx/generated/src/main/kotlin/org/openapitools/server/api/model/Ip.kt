/**
* openapi-ipify
* OpenAPI client for ipify, a simple public IP address API
*
* The version of the OpenAPI document: 2.0.1-pre.0
* Contact: blah@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.api.model


        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param ip 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class Ip (
    @SerializedName("ip") private val _ip: kotlin.String?
) {

        val ip get() = _ip ?: throw IllegalArgumentException("ip is required")
                    
}

