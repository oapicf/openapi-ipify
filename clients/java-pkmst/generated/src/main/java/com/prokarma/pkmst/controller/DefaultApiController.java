package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.Ip;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implementation
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-06-22T00:02:55.317674714Z[Etc/UTC]", comments = "Generator version: 7.6.0")
@Controller
public class DefaultApiController implements DefaultApi {
    private final ObjectMapper objectMapper;
@Autowired
    public DefaultApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Ip> getIp(@ApiParam(value = "Response format", allowableValues = "json, jsonp")  @RequestParam(value = "format", required = false) String format,
        @ApiParam(value = "JSONP callback function name")  @RequestParam(value = "callback", required = false) String paramCallback,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/javascript")) {
            return new ResponseEntity<Ip>(objectMapper.readValue("", Ip.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Ip>(objectMapper.readValue("", Ip.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("text/plain")) {
            return new ResponseEntity<Ip>(objectMapper.readValue("", Ip.class), HttpStatus.OK);
        }

        return new ResponseEntity<Ip>(HttpStatus.OK);
    }

}
