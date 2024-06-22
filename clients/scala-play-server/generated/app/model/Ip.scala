package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Ip.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-06-22T00:51:58.422197741Z[Etc/UTC]", comments = "Generator version: 7.6.0")
case class Ip(
  ip: String
)

object Ip {
  implicit lazy val ipJsonFormat: Format[Ip] = Json.format[Ip]
}

