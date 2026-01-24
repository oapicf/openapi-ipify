package api

import play.api.libs.json._
import model.GetIp200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-24T04:46:52.546164679Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait DefaultApi {
  /**
    * Get your public IP address
    * @param format Response format
    * @param callback JSONP callback function name
    */
  def getIp(format: Option[String], callback: Option[String]): String
}
