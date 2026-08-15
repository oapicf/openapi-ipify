package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for getIp_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-15T01:59:40.212304587Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class GetIp200Response(
  ip: Option[String]
)

object GetIp200Response {
  implicit lazy val getIp200ResponseJsonFormat: Format[GetIp200Response] = Json.format[GetIp200Response]
}

