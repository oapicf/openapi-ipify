namespace OpenAPI

open DefaultApiHandlerParams
open DefaultApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module DefaultApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region GetIp
    /// <summary>
    /// Get your public IP address
    /// </summary>
   [<FunctionName("GetIp")>]
    let GetIp
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/")>]
        req:HttpRequest ) =

      let result = DefaultApiService.GetIp ()
      match result with
      | GetIpStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

