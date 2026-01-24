package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetIp200Response._

case class GetIp200Response (
  ip: Option[String])

object GetIp200Response {
  import DateTimeCodecs._

  implicit val GetIp200ResponseCodecJson: CodecJson[GetIp200Response] = CodecJson.derive[GetIp200Response]
  implicit val GetIp200ResponseDecoder: EntityDecoder[GetIp200Response] = jsonOf[GetIp200Response]
  implicit val GetIp200ResponseEncoder: EntityEncoder[GetIp200Response] = jsonEncoderOf[GetIp200Response]
}
