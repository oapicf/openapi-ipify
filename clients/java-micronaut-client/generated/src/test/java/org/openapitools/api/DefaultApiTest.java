package org.openapitools.api;

import org.openapitools.model.Ip;
import org.openapitools.model.OneOfIpstring;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DefaultApi
 */
@MicronautTest
public class DefaultApiTest {

    @Inject
    DefaultApi api;

    
    /**
     * Get your public IP address
     */
    @Test
    public void getIpTest() {
        String _format = null;
        String paramCallback = null;
        // OneOfIpstring response = api.getIp(_format, paramCallback).block();
        // Mono<OneOfIpstring> asyncResponse = api.getIp(_format, paramCallback);
        // TODO: test validations
    }

    
}
