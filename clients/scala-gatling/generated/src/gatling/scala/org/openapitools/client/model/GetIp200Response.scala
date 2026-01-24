
package org.openapitools.client.model


case class GetIp200Response (
    _ip: Option[String]
)
object GetIp200Response {
    def toStringBody(var_ip: Object) =
        s"""
        | {
        | "ip":$var_ip
        | }
        """.stripMargin
}
