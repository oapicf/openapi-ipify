package api

import play.api.libs.json._
import model.GetIp200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-14T06:53:15.333288916Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait DefaultApi {
  /**
    * Get your public IP address
    * @param format Response format
    * @param callback JSONP callback function name
    */
  def getIp(format: Option[String], callback: Option[String]): String
}
