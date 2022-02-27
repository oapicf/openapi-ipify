/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Ip;
import org.openapitools.model.OneOfIpstring;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-27T09:48:14.040802Z[Etc/UTC]")
@Validated
@Tag(name = "default", description = "the default API")
public interface DefaultApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET / : Get your public IP address
     *
     * @param format Response format (optional)
     * @param paramCallback JSONP callback function name (optional)
     * @return Your public IP address (status code 200)
     */
    @Operation(
        operationId = "getIp",
        summary = "Get your public IP address",
        responses = {
            @ApiResponse(responseCode = "200", description = "Your public IP address", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  OneOfIpstring.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/",
        produces = { "*/*" }
    )
    default ResponseEntity<OneOfIpstring> getIp(
        @Parameter(name = "format", description = "Response format", schema = @Schema(description = "", allowableValues = { "json", "jsonp" })) @Valid @RequestParam(value = "format", required = false) String format,
        @Parameter(name = "callback", description = "JSONP callback function name", schema = @Schema(description = "")) @Valid @RequestParam(value = "callback", required = false) String paramCallback
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
