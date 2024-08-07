/**
 * openapi-ipify
 * OpenAPI client for ipify, a simple public IP address API
 *
 * The version of the OpenAPI document: 5.3.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.api

import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object DefaultApi {

  def apply(baseUrl: String = "https://api.ipify.org") = new DefaultApi(baseUrl)
}

class DefaultApi(baseUrl: String) {

  /**
   * Expected answers:
   *   code 200 : String (Your public IP address)
   * 
   * @param format Response format
   * @param callback JSONP callback function name
   */
  def getIp(format: Option[String] = None, callback: Option[String] = None): ApiRequest[String] =
    ApiRequest[String](ApiMethods.GET, baseUrl, "/", "application/json")
      .withQueryParam("format", format)
      .withQueryParam("callback", callback)
      .withSuccessResponse[String](200)
      



}

