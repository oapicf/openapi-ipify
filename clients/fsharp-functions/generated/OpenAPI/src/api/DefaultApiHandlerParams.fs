namespace OpenAPI

open OpenAPI.Model.Ip
open System.Collections.Generic
open System

module DefaultApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type GetIpQueryParams = {
      format : string option;


      callback : string option;

    }
    //#endregion


    type GetIpStatusCode200Response = {
      content:Ip;
      
    }
    type GetIpResult = GetIpStatusCode200 of GetIpStatusCode200Response

    type GetIpArgs = {
      queryParams:Result<GetIpQueryParams,string>;
    }
