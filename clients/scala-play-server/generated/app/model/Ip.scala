package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Ip.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-08-08T13:00:53.372801Z[Etc/UTC]")
case class Ip(
  ip: String
)

object Ip {
  implicit lazy val ipJsonFormat: Format[Ip] = Json.format[Ip]
}

