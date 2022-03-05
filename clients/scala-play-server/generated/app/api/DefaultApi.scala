package api

import play.api.libs.json._
import model.Ip
import model.OneOfIpstring

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-03-05T07:34:51.406219Z[Etc/UTC]")
trait DefaultApi {
  /**
    * Get your public IP address
    * @param format Response format
    * @param callback JSONP callback function name
    */
  def getIp(format: Option[String], callback: Option[String]): OneOfIpstring
}
