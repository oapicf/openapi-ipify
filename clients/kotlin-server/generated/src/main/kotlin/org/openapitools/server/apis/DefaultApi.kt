/**
* openapi-ipify
* OpenAPI client for ipify, a simple public IP address API
*
* The version of the OpenAPI document: 3.3.1-pre.0
* Contact: blah@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.apis

import com.google.gson.Gson
import io.ktor.application.*
import io.ktor.auth.*
import io.ktor.http.*
import io.ktor.response.*
import org.openapitools.server.Paths
import io.ktor.locations.*
import io.ktor.routing.*
import org.openapitools.server.infrastructure.ApiPrincipal
import org.openapitools.server.models.Ip

@KtorExperimentalLocationsAPI
fun Route.DefaultApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()

    get<Paths.getIp> {
        val exampleContentType = "application/javascript"
        val exampleContentString = """Custom MIME type example not yet supported: application/javascript"""
        
        when (exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }

}
