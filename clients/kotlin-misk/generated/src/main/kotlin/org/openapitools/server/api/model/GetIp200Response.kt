package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GetIp200Response(
    val ip: kotlin.String? = null
)
