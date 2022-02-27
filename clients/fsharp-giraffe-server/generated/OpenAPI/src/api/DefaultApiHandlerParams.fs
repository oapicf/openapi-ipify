namespace OpenAPI

open OpenAPI.Model.Ip
open OpenAPI.Model.OneOfIpstring
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
      content:OneOfIpstring;
      
    }
    type GetIpResult = GetIpStatusCode200 of GetIpStatusCode200Response

    type GetIpArgs = {
      queryParams:Result<GetIpQueryParams,string>;
    }
