/**
 * openapi-ipify
 * OpenAPI client for ipify, a simple public IP address API
 *
 * The version of the OpenAPI document: 5.3.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */


package org.openapitools.app

import org.scalatra.swagger.{ ApiInfo, SwaggerWithAuth, Swagger }
import org.scalatra.swagger.{ JacksonSwaggerBase, Swagger }
import org.scalatra.ScalatraServlet
import org.json4s.{ DefaultFormats, Formats }

class ResourcesApp(implicit protected val swagger: OpenAPIApp)
  extends ScalatraServlet with JacksonSwaggerBase {
  before() {
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
}

class OpenAPIApp extends Swagger(apiInfo = OpenAPIInfo.apiInfo, apiVersion = "5.3.1-pre.0", swaggerVersion = Swagger.SpecVersion)

object OpenAPIInfo {
  val apiInfo = ApiInfo(
    """openapi-ipify""",
    """OpenAPI client for ipify, a simple public IP address API""",
    """https://github.com/oapicf/openapi-ipify""",
    """blah+oapicf@cliffano.com""",
    """MIT""",
    """http://apache.org/licenses/LICENSE-2.0.html""")
}
