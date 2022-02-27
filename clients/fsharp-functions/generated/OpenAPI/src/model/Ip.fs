namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module Ip =

  //#region Ip

  [<CLIMutable>]
  type Ip = {
    [<JsonProperty(PropertyName = "ip")>]
    _Ip : string;
  }

  //#endregion
