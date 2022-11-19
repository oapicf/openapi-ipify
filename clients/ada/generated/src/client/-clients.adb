--  openapi_ipify
--  OpenAPI client for ipify, a simple public IP address API
--
--  The version of the OpenAPI document: 3.2.2_pre.0
--  Contact: blah@cliffano.com
--
--  NOTE: This package is auto generated by OpenAPI-Generator 6.2.1.
--  https://openapi-generator.tech
--  Do not edit the class manually.

pragma Warnings (Off, "*is not referenced");
with Swagger.Streams;
package body .Clients is
   pragma Style_Checks ("-mr");

   --  Get your public IP address
   procedure Get_Ip
      (Client : in out Client_Type;
       Format : in Swagger.Nullable_UString;
       Callback : in Swagger.Nullable_UString;
       Result : out .Models.Ip_Type) is
      URI   : Swagger.Clients.URI_Type;
      Reply : Swagger.Value_Type;
   begin
      Client.Set_Accept ((Swagger.Clients.APPLICATION_JSON,
                          Swagger.Clients.APPLICATION_JAVASCRIPT,
                          Swagger.Clients.TEXT_PLAIN));

      URI.Add_Param ("format", Format);
      URI.Add_Param ("callback", Callback);
      URI.Set_Path ("/");
      Client.Call (Swagger.Clients.GET, URI, Reply);
      .Models.Deserialize (Reply, "", Result);
   end Get_Ip;
end .Clients;
