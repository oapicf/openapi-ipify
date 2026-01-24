package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param ip 
 */
case class GetIp200Response(ip: Option[String]
                )

object GetIp200Response {
    /**
     * Creates the codec for converting GetIp200Response from and to JSON.
     */
    implicit val decoder: Decoder[GetIp200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetIp200Response] = deriveEncoder
}
