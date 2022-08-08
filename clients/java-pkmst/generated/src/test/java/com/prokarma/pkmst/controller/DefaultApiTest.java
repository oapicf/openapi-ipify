/*
 * openapi-ipify
 * OpenAPI client for ipify, a simple public IP address API
 *
 * The version of the OpenAPI document: 3.0.1-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.prokarma.pkmst.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.prokarma.pkmst.model.Ip;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    private final DefaultApi api = new DefaultApiController(objectMapper);

    private final String accept = "application/json";

    
    /**
     * Get your public IP address
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getIpTest() throws Exception {
        String format = null;
        String paramCallback = null;
    ResponseEntity<Ip> response = api.getIp(format, paramCallback , accept);

        // TODO: test validations
    }
    
}
