@file:Suppress(
    "RemoveRedundantQualifierName",
    "UnusedImport",
    "unused",
)

package org.openapitools.apis

import com.fasterxml.jackson.databind.ObjectMapper
import com.github.tomakehurst.wiremock.client.MappingBuilder
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder
import com.github.tomakehurst.wiremock.client.WireMock.*
import com.github.tomakehurst.wiremock.matching.StringValuePattern
import org.openapitools.models.*

/**
 * WireMock stub request builder.
 */
open class DefaultApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation getIp.
     *
     * @param format query parameter format pattern.
     * @param paramCallback query parameter paramCallback pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetIpStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getIp(format: StringValuePattern? = null, paramCallback: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetIpStubBuilder =
        GetIpStubBuilder(objectMapper, get(urlPathTemplate("/"))
            .apply { format?.let { withQueryParam("format", it) } }
            .apply { paramCallback?.let { withQueryParam("callback", it) } }
            .configurer()
        )
}
