namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GetIp200Response =

  //#region GetIp200Response

  [<CLIMutable>]
  type GetIp200Response = {
    [<JsonProperty(PropertyName = "ip")>]
    Ip : string;
  }

  //#endregion
