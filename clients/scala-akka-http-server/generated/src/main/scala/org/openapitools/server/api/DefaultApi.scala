package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class DefaultApi(
    defaultService: DefaultApiService
) {

  
  
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

  def getIp200(responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((200, responseString))
  /**
   * Code: 200, Message: Your public IP address, DataType: String
   */
  def getIp(format: Option[String], callback: Option[String]): Route

}


