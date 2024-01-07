package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Ip.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-01-07T07:56:56.890776493Z[Etc/UTC]")
case class Ip(
  ip: String
)

object Ip {
  implicit lazy val ipJsonFormat: Format[Ip] = Json.format[Ip]
}

