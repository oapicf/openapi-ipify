--  openapi_ipify
--  OpenAPI client for ipify, a simple public IP address API
--  ------------ EDIT NOTE ------------
--  This file was generated with openapi-generator.  You can modify it to implement
--  the server.  After you modify this file, you should add the following line
--  to the .openapi-generator-ignore file:
--
--  src/-servers.adb
--
--  Then, you can drop this edit note comment.
--  ------------ EDIT NOTE ------------
package body .Servers is


   --  Get your public IP address
   overriding
   procedure Get_Ip
      (Server : in out Server_Type;
       Format : in Swagger.Nullable_UString;
       Callback : in Swagger.Nullable_UString;
       Result  : out Swagger.Object;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Ip;

end .Servers;
