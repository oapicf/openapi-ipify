package org.openapitools.api

import org.openapitools.model.GetIp200Response
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired
import org.openapitools.api.DefaultApiController.Companion.BASE_PATH

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${openapi.openapiIpify.base-path:\${api.base-path:$BASE_PATH}}")
class DefaultApiController() {

    @Operation(
        summary = "Get your public IP address",
        operationId = "getIp",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Your public IP address", content = [Content(schema = Schema(implementation = kotlin.String::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_GET_IP /* "/" */],
        produces = ["text/plain", "application/json", "application/javascript"]
    )
    fun getIp(
        @Parameter(description = "Response format", schema = Schema(allowableValues = ["json", "jsonp"])) @Valid @RequestParam(value = "format", required = false) format: kotlin.String?,
        @Parameter(description = "JSONP callback function name") @Valid @RequestParam(value = "callback", required = false) paramCallback: kotlin.String?
    ): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = ""
        const val PATH_GET_IP: String = "/"
    }
}
