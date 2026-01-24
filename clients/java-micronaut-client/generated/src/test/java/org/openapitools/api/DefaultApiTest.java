package org.openapitools.api;

import org.openapitools.model.GetIp200Response;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

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
    @Disabled("Not Implemented")
    public void getIpTest() {
        // given
        String _format = "example";
        String paramCallback = "example";

        // when
        String body = api.getIp(_format, paramCallback).block();

        // then
        // TODO implement the getIpTest()
    }

    
}
