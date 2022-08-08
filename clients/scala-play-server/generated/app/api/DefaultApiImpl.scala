package api

import model.Ip

/**
  * Provides a default implementation for [[DefaultApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-08-08T13:00:53.372801Z[Etc/UTC]")
class DefaultApiImpl extends DefaultApi {
  /**
    * @inheritdoc
    */
  override def getIp(format: Option[String], callback: Option[String]): Ip = {
    // TODO: Implement better logic

    Ip("")
  }
}
