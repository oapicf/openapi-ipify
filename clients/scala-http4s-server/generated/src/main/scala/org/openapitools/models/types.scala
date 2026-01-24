package org.openapitools.models

import java.time._

import io.circe.refined._
import io.circe.syntax._
import io.circe.{ Decoder, Encoder }
import io.circe.generic.semiauto.{ deriveDecoder, deriveEncoder }


/**
* 
* @param ip 
*/

case class GetIp200Response(
  ip: Option[String]
)
object GetIp200Response {
  implicit val encoderGetIp200Response: Encoder[GetIp200Response] = deriveEncoder[GetIp200Response].mapJson(_.dropNullValues)
  implicit val decoderGetIp200Response: Decoder[GetIp200Response] = deriveDecoder[GetIp200Response]
}

