package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for getIp_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-01T11:40:30.545165998Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class GetIp200Response(
  ip: Option[String]
)

object GetIp200Response {
  implicit lazy val getIp200ResponseJsonFormat: Format[GetIp200Response] = Json.format[GetIp200Response]
}

