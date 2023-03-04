/**
 * openapi-ipify
 * OpenAPI client for ipify, a simple public IP address API
 *
 * The version of the OpenAPI document: 3.3.1-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api

import java.text.SimpleDateFormat

import org.openapitools.client.model.Ip
import org.openapitools.client.{ApiInvoker, ApiException}

import collection.mutable
import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart
import com.wordnik.swagger.client._
import com.wordnik.swagger.client.ClientResponseReaders.Json4sFormatsReader._
import com.wordnik.swagger.client.RequestWriters.Json4sFormatsWriter._
import javax.ws.rs.core.Response.Status.Family

import java.net.URI
import java.io.File
import java.util.Date
import java.util.TimeZone
import javax.ws.rs.core.{MediaType, Response}

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._
import scala.collection.mutable.HashMap
import scala.util.{Failure, Success, Try}

import org.json4s._

class DefaultApi(
  val defBasePath: String = "https://api.ipify.org",
  defApiInvoker: ApiInvoker = ApiInvoker
) {
  private lazy val dateTimeFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  private val dateFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  implicit val formats = new org.json4s.DefaultFormats {
    override def dateFormatter = dateTimeFormatter
  }
  implicit val stringReader: ClientResponseReader[String] = ClientResponseReaders.StringReader
  implicit val unitReader: ClientResponseReader[Unit] = ClientResponseReaders.UnitReader
  implicit val jvalueReader: ClientResponseReader[JValue] = ClientResponseReaders.JValueReader
  implicit val jsonReader: ClientResponseReader[Nothing] = JsonFormatsReader
  implicit val stringWriter: RequestWriter[String] = RequestWriters.StringWriter
  implicit val jsonWriter: RequestWriter[Nothing] = JsonFormatsWriter

  var basePath: String = defBasePath
  var apiInvoker: ApiInvoker = defApiInvoker

  def addHeader(key: String, value: String): mutable.HashMap[String, String] = {
    apiInvoker.defaultHeaders += key -> value
  }

  val config: SwaggerConfig = SwaggerConfig.forUrl(new URI(defBasePath))
  val client = new RestClient(config)
  val helper = new DefaultApiAsyncHelper(client, config)

  /**
   * Get your public IP address
   * 
   *
   * @param format Response format (optional)
   * @param callback JSONP callback function name (optional)
   * @return Ip
   */
  def getIp(format: Option[String] = None, callback: Option[String] = None): Option[Ip] = {
    val await = Try(Await.result(getIpAsync(format, callback), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get your public IP address asynchronously
   * 
   *
   * @param format Response format (optional)
   * @param callback JSONP callback function name (optional)
   * @return Future(Ip)
   */
  def getIpAsync(format: Option[String] = None, callback: Option[String] = None): Future[Ip] = {
      helper.getIp(format, callback)
  }

}

class DefaultApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def getIp(format: Option[String] = None,
    callback: Option[String] = None
    )(implicit reader: ClientResponseReader[Ip]): Future[Ip] = {
    // create path and map variables
    val path = (addFmt("/"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    format match {
      case Some(param) => queryParams += "format" -> param.toString
      case _ => queryParams
    }
    callback match {
      case Some(param) => queryParams += "callback" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      val status = Response.Status.fromStatusCode(resp.statusCode)
      status.getFamily match {
        case Family.SUCCESSFUL | Family.REDIRECTION | Family.INFORMATIONAL => process(reader.read(resp))
        case _ => throw new ApiException(resp.statusCode, resp.statusText)
      }
    }
  }


}
