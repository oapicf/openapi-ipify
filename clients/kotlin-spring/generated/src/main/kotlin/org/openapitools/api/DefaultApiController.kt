package org.openapitools.api

import org.openapitools.model.Ip
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

import javax.validation.constraints.*
import javax.validation.Valid

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:}")
class DefaultApiController() {

    @Operation(
        summary = "Get your public IP address",
        operationId = "getIp",
        description = "",
        responses = [
            ApiResponse(responseCode = "200", description = "Your public IP address", content = [Content(schema = Schema(implementation = Ip::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/"],
        produces = ["application/json", "application/javascript", "text/plain"]
    )
    fun getIp(@Parameter(description = "Response format", schema = Schema(allowableValues = ["json", "jsonp"])) @Valid @RequestParam(value = "format", required = false) format: kotlin.String?,@Parameter(description = "JSONP callback function name") @Valid @RequestParam(value = "callback", required = false) paramCallback: kotlin.String?): ResponseEntity<Ip> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
