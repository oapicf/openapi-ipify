namespace OpenAPI
open DefaultApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module DefaultApiServiceInterface =

    //#region Service interface
    type IDefaultApiService =
      abstract member GetIp : unit -> GetIpResult
    //#endregion