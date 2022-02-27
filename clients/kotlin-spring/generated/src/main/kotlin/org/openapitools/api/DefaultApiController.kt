package org.openapitools.api

import org.openapitools.model.Ip
import org.openapitools.model.OneOfLessThanIpCommaStringGreaterThan
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


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/"],
        produces = ["*/*"]
    )
    fun getIp( @RequestParam(value = "format", required = false) format: kotlin.String?
, @RequestParam(value = "callback", required = false) paramCallback: kotlin.String?
): ResponseEntity<OneOfLessThanIpCommaStringGreaterThan> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
