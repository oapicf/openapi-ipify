
package org.openapitools.client.model


case class Ip (
    _ip: String
)
object Ip {
    def toStringBody(var_ip: Object) =
        s"""
        | {
        | "ip":$var_ip
        | }
        """.stripMargin
}
