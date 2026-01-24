package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.GetIp200Response


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class DefaultApiRoutes[
  F[_]: JsonDecoder: Monad
](delegate: DefaultApiDelegate[F]) extends Http4sDsl[F] {
  object getIp {
    import DefaultApiDelegate.getIpResponses

    object formatQueryParam extends OptionalQueryParamDecoderMatcher[String]("format")
    object callbackQueryParam extends OptionalQueryParamDecoderMatcher[String]("callback")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "" :? formatQueryParam(format) +& callbackQueryParam(callback) =>
        delegate.getIp.handle(req, format, callback, responses)

    }


    val responses: getIpResponses[F] = new getIpResponses[F] {
      def resp200(value: String): F[Response[F]] = Ok(value)
      def resp200(): F[Response[F]] = Ok()
    }
  }

  val routes =
    getIp.route
}

object DefaultApiDelegate {
  trait getIpResponses[F[_]] {
    def resp200(value: String): F[Response[F]]
    def resp200(): F[Response[F]]
  }

}

trait DefaultApiDelegate[F[_]] {

  trait getIp {
    import DefaultApiDelegate.getIpResponses

    def handle(
      req: Request[F],
      format: Option[String],
      callback: Option[String],
      responses: getIpResponses[F]
    ): F[Response[F]]

  }
  def getIp: getIp

}