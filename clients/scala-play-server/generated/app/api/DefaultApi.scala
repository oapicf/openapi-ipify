package api

import play.api.libs.json._
import model.Ip

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2023-03-04T02:38:01.915925Z[Etc/UTC]")
trait DefaultApi {
  /**
    * Get your public IP address
    * @param format Response format
    * @param callback JSONP callback function name
    */
  def getIp(format: Option[String], callback: Option[String]): Ip
}
