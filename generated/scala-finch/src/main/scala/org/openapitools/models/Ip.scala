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
case class Ip(ip: String
                )

object Ip {
    /**
     * Creates the codec for converting Ip from and to JSON.
     */
    implicit val decoder: Decoder[Ip] = deriveDecoder
    implicit val encoder: ObjectEncoder[Ip] = deriveEncoder
}
