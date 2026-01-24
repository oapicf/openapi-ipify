package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for getIp_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-24T04:46:52.546164679Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class GetIp200Response(
  ip: Option[String]
)

object GetIp200Response {
  implicit lazy val getIp200ResponseJsonFormat: Format[GetIp200Response] = Json.format[GetIp200Response]
}

