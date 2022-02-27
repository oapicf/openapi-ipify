namespace OpenAPI
open DefaultApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module DefaultApiServiceInterface =

    //#region Service interface
    type IDefaultApiService =
      abstract member GetIp:HttpContext -> GetIpArgs->GetIpResult
    //#endregion