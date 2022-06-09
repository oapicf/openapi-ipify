--  openapi_ipify
--  OpenAPI client for ipify, a simple public IP address API
--
--  The version of the OpenAPI document: 2.0.1_pre.0
--  Contact: blah@cliffano.com
--
--  NOTE: This package is auto generated by OpenAPI-Generator 6.0.0.
--  https://openapi-generator.tech
--  Do not edit the class manually.

with .Models;
with Swagger.Clients;
package .Clients is
   pragma Style_Checks ("-mr");

   type Client_Type is new Swagger.Clients.Client_Type with null record;

   --  Get your public IP address
   procedure Get_Ip
      (Client : in out Client_Type;
       Format : in Swagger.Nullable_UString;
       Callback : in Swagger.Nullable_UString;
       Result : out .Models.Ip_Type);

end .Clients;
