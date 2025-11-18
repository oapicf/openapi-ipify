package org.openapitools.api

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
@RequestMapping("\${api.base-path:}")
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
        value = ["/"],
        produces = ["text/plain", "text/javascript", "application/javascript", "application/json"]
    )
    fun getIp(@Parameter(description = "Response format", schema = Schema(allowableValues = ["json", "jsonp"])) @Valid @RequestParam(value = "format", required = false) format: kotlin.String?,@Parameter(description = "JSONP callback function name") @Valid @RequestParam(value = "callback", required = false) paramCallback: kotlin.String?): ResponseEntity<kotlin.String> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
