package org.openapitools.api

import org.openapitools.model.Ip
import org.openapitools.model.OneOfLessThanIpCommaStringGreaterThan
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class DefaultApiTest {

    private val api: DefaultApiController = DefaultApiController()

    /**
     * To test DefaultApiController.getIp
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getIpTest() {
        val format:kotlin.String? = TODO()
        val paramCallback:kotlin.String? = TODO()
        val response: ResponseEntity<OneOfLessThanIpCommaStringGreaterThan> = api.getIp(format, paramCallback)

        // TODO: test validations
    }

}
