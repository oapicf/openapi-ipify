namespace OpenAPI
open OpenAPI.Model.Ip
open OpenAPI.Model.OneOfIpstring
open DefaultApiHandlerParams
open DefaultApiServiceInterface
open System.Collections.Generic
open System

module DefaultApiServiceImplementation =

    //#region Service implementation
    type DefaultApiServiceImpl() =
      interface IDefaultApiService with

        member this.GetIp () =
            let content = "Your public IP address" :> obj :?> OneOfIpstring // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetIpStatusCode200 { content = content }

      //#endregion

    let DefaultApiService = DefaultApiServiceImpl() :> IDefaultApiService