--  openapi_ipify
--  OpenAPI client for ipify, a simple public IP address API
--
--  The version of the OpenAPI document: 5.3.1_pre.0
--  Contact: blah+oapicf@cliffano.com
--
--  NOTE: This package is auto generated by OpenAPI-Generator 7.12.0.
--  https://openapi-generator.tech
--  Do not edit the class manually.

pragma Warnings (Off, "*is not referenced");
with Swagger.Streams;
package body .Clients is
   pragma Style_Checks ("-bmrIu");

   Mime_1 : aliased constant String := "text/javascript";
   Media_List_1 : constant Swagger.Mime_List := (
     1 => Swagger.Mime_Json,
   
     2 => Mime_1'Access,
   
     3 => Swagger.Mime_Text   );


   --  Get your public IP address
   procedure Get_Ip
      (Client : in out Client_Type;
       Format : in Swagger.Nullable_UString;
       Callback : in Swagger.Nullable_UString;
       Result : out Swagger.UString) is
      URI   : Swagger.Clients.URI_Type;
      Reply : Swagger.Value_Type;
   begin
      Client.Set_Accept (Media_List_1);


      URI.Add_Param ("format", Format);
      URI.Add_Param ("callback", Callback);
      URI.Set_Path ("/");
      Client.Call (Swagger.Clients.GET, URI, Reply);
      .Models.Deserialize (Reply, "", Result);
   end Get_Ip;
end .Clients;
