/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.prokarma.pkmst.controller;


import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

import java.util.List;
/**
 * Provides the info about api methods
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-06-23T05:13:03.733580993Z[Etc/UTC]", comments = "Generator version: 7.6.0")
@Api(value = "Default", description = "the Default API")
public interface DefaultApi {

    @ApiOperation(value = "Get your public IP address", notes = "", response = String.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Your public IP address", response = String.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/",
        produces = { "text/plain", "application/javascript", "application/json" }
    )
    ResponseEntity<String> getIp(@ApiParam(value = "Response format", allowableValues = "json, jsonp")  @RequestParam(value = "format", required = false) String format,@ApiParam(value = "JSONP callback function name")  @RequestParam(value = "callback", required = false) String paramCallback, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;

}
