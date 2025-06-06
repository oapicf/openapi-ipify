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
pragma Warnings (Off, "*no entities of*are referenced");
with Swagger.Servers;
with .Models;
with Security.Permissions;
package .Skeletons is
   pragma Style_Checks ("-bmrIu");
   pragma Warnings (Off, "*use clause for package*");
   use .Models;
   type Server_Type is limited interface;



   --  Get your public IP address
   procedure Get_Ip
      (Server : in out Server_Type;
       Format : in Swagger.Nullable_UString;
       Callback : in Swagger.Nullable_UString;
       Result  : out Swagger.UString;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   generic
      type Implementation_Type is limited new Server_Type with private;
      URI_Prefix : String := "";
   package Skeleton is

      procedure Register (Server : in out Swagger.Servers.Application_Type'Class);


      --  Get your public IP address
      procedure Get_Ip
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);

   end Skeleton;

   generic
      type Implementation_Type is limited new Server_Type with private;
      URI_Prefix : String := "";
   package Shared_Instance is

      procedure Register (Server : in out Swagger.Servers.Application_Type'Class);


      --  Get your public IP address
      procedure Get_Ip
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


   private
      protected Server is

         --  Get your public IP address
         procedure Get_Ip
            (Format : in Swagger.Nullable_UString;
             Callback : in Swagger.Nullable_UString;
       Result  : out Swagger.UString;
             Context : in out Swagger.Servers.Context_Type);

      private
         Impl : Implementation_Type;
      end Server;
   end Shared_Instance;

end .Skeletons;
