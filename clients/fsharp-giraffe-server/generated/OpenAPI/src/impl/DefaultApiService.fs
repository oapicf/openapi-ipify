namespace OpenAPI
open OpenAPI.Model.Ip
open DefaultApiHandlerParams
open DefaultApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module DefaultApiServiceImplementation =

    //#region Service implementation
    type DefaultApiServiceImpl() =
      interface IDefaultApiService with

        member this.GetIp ctx args =
            let content = "Your public IP address" :> obj :?> Ip // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetIpStatusCode200 { content = content }

      //#endregion

    let DefaultApiService = DefaultApiServiceImpl() :> IDefaultApiService