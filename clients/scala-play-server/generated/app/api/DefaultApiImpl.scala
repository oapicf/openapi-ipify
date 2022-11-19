package api

import model.Ip

/**
  * Provides a default implementation for [[DefaultApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-11-19T01:31:07.277757Z[Etc/UTC]")
class DefaultApiImpl extends DefaultApi {
  /**
    * @inheritdoc
    */
  override def getIp(format: Option[String], callback: Option[String]): Ip = {
    // TODO: Implement better logic

    Ip("")
  }
}
