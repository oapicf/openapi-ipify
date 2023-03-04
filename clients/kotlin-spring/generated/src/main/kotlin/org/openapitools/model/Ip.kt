package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.*
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param ip 
 */
data class Ip(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("ip", required = true) val ip: kotlin.String
) {

}

