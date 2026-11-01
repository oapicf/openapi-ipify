package api

import play.api.libs.json._
import model.GetIp200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-01T11:40:30.545165998Z[Etc/UTC]", comments = "Generator version: 7.26.0")
trait DefaultApi {
  /**
    * Get your public IP address
    * @param format Response format
    * @param callback JSONP callback function name
    */
  def getIp(format: Option[String], callback: Option[String]): String
}
