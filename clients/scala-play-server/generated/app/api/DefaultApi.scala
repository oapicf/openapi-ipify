package api

import play.api.libs.json._

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-09T23:58:40.096939757Z[Etc/UTC]", comments = "Generator version: 7.6.0")
trait DefaultApi {
  /**
    * Get your public IP address
    * @param format Response format
    * @param callback JSONP callback function name
    */
  def getIp(format: Option[String], callback: Option[String]): String
}
