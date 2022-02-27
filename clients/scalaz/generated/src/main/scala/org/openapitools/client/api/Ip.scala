package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Ip._

case class Ip (
  ip: String)

object Ip {
  import DateTimeCodecs._

  implicit val IpCodecJson: CodecJson[Ip] = CodecJson.derive[Ip]
  implicit val IpDecoder: EntityDecoder[Ip] = jsonOf[Ip]
  implicit val IpEncoder: EntityEncoder[Ip] = jsonEncoderOf[Ip]
}
