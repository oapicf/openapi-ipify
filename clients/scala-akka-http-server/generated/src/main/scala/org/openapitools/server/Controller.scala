package org.openapitools.server

import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Route
import org.openapitools.server.api.DefaultApi

import akka.http.scaladsl.server.Directives._
import akka.actor.ActorSystem
import akka.stream.Materializer

class Controller(default: DefaultApi)(implicit system: ActorSystem, materializer: Materializer) {

    lazy val routes: Route = default.route 

    Http().newServerAt("0.0.0.0", 9000).bind(routes)
}
