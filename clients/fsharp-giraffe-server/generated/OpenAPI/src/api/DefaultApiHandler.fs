namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open DefaultApiHandlerParams
open DefaultApiServiceInterface
open DefaultApiServiceImplementation
open OpenAPI.Model.GetIp200Response

module DefaultApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GetIp
    /// <summary>
    /// Get your public IP address
    /// </summary>

    let GetIp  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetIpQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : GetIpArgs
          let result = DefaultApiService.GetIp ctx serviceArgs
          return! (match result with
                      | GetIpStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
          ) next ctx
        }
    //#endregion

