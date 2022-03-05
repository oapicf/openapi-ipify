package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.Ip


class DefaultApi(
    defaultService: DefaultApiService,
    defaultMarshaller: DefaultApiMarshaller
) {

  
  import defaultMarshaller._

  lazy val route: Route =
    path() { 
      get { 
        parameters("format".as[String].?, "callback".as[String].?) { (format, callback) => 
            defaultService.getIp(format = format, callback = callback)
        }
      }
    }
}


trait DefaultApiService {

  def getIp200(responseIp: Ip)(implicit toEntityMarshallerIp: ToEntityMarshaller[Ip]): Route =
    complete((200, responseIp))
  /**
   * Code: 200, Message: Your public IP address, DataType: Ip
   */
  def getIp(format: Option[String], callback: Option[String])
      (implicit toEntityMarshallerIp: ToEntityMarshaller[Ip]): Route

}

trait DefaultApiMarshaller {


  implicit def toEntityMarshallerIp: ToEntityMarshaller[Ip]

}

