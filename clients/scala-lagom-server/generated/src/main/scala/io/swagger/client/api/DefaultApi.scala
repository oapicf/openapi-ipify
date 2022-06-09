/**
 * openapi-ipify
 * OpenAPI client for ipify, a simple public IP address API
 *
 * The version of the OpenAPI document: 2.0.1-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.swagger.client.api

import akka.{Done, NotUsed}
import com.lightbend.lagom.scaladsl.api.transport.Method
import com.lightbend.lagom.scaladsl.api.{Service, ServiceCall}
import play.api.libs.json._
import com.lightbend.lagom.scaladsl.api.deser.PathParamSerializer

import io.swagger.client.model.Ip

trait DefaultApi extends Service {


  final override def descriptor = {
    import Service._
    named("DefaultApi").withCalls(
      restCall(Method.GET, "/?format&callback", getIp _)
    ).withAutoAcl(true)
  }

      
  /**
    * Get your public IP address
    * 
    *  
    * @param format Response format (optional) 
    * @param callback JSONP callback function name (optional)
    * @return Ip
    */
  def getIp(format: Option[DefaultApiFormatEnum.DefaultApiFormatEnum]callback:           Option[String] = None): ServiceCall[NotUsed ,Ip]
  

        object DefaultApiFormatEnum extends Enumeration {
        val   json, jsonp = Value     
        type DefaultApiFormatEnum = Value
        implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[DefaultApiFormatEnum.type])
        implicit val pathParamSerializer: PathParamSerializer[DefaultApiFormatEnum] = PathParamSerializer.required("DefaultApiFormatEnum")(withName)(_.toString)
        }
  }
