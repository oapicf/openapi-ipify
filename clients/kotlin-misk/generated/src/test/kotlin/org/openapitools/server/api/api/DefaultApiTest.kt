package org.openapitools.server.api.api

import misk.testing.MiskTestModule
import jakarta.inject.Inject
import misk.testing.MiskTest
import misk.testing.MiskTestModule
import org.junit.jupiter.api.Test
import misk.web.HttpCall
import misk.web.PathParam
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestHeader
import org.openapitools.server.api.model.GetIp200Response

@MiskTest(startService = true)
internal class DefaultApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var defaultApi: DefaultApiAction

    /**
     * To test DefaultApiAction.getIp
     */
    @Test
    fun `should handle getIp`() {
        val format = TODO()
        val paramCallback = TODO()
        val response: kotlin.String = defaultApi.getIp(format, paramCallback)
    }
}
