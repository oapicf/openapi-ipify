package org.openapitools.server

import io.ktor.server.routing.*
import org.openapitools.server.apis.DefaultApi



fun Route.AllApis() {
    DefaultApi()
}
