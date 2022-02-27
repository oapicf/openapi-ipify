--  openapi_ipify
--  OpenAPI client for ipify, a simple public IP address API
--
--  The version of the OpenAPI document: 1.0.0_pre.0
--  Contact: blah@cliffano.com
--
--  NOTE: This package is auto generated by OpenAPI-Generator 5.4.0.
--  https://openapi-generator.tech
--  Do not edit the class manually.

pragma Warnings (Off, "*is not referenced");
with Swagger.Streams;
with Swagger.Servers.Operation;
package body .Skeletons is
   pragma Style_Checks ("-mr");
   pragma Warnings (Off, "*use clause for package*");

   use Swagger.Streams;

   package body Skeleton is


      package API_Get_Ip is
         new Swagger.Servers.Operation (Handler => Get_Ip,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/");

      --  Get your public IP address
      procedure Get_Ip
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Format : Swagger.Nullable_UString;
         Callback : Swagger.Nullable_UString;
         Result : .Models.OneOfIpstring_Type;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "format", Format);
         Swagger.Servers.Get_Query_Parameter (Req, "callback", Callback);
         Impl.Get_Ip
            (Format,
             Callback, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Ip;

      procedure Register (Server : in out Swagger.Servers.Application_Type'Class) is
      begin
         Swagger.Servers.Register (Server, API_Get_Ip.Definition);
      end Register;

   end Skeleton;

   package body Shared_Instance is


      --  Get your public IP address
      procedure Get_Ip
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Format : Swagger.Nullable_UString;
         Callback : Swagger.Nullable_UString;
         Result : .Models.OneOfIpstring_Type;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "format", Format);
         Swagger.Servers.Get_Query_Parameter (Req, "callback", Callback);
         Server.Get_Ip
            (Format,
             Callback, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Ip;

      package API_Get_Ip is
         new Swagger.Servers.Operation (Handler => Get_Ip,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/");

      procedure Register (Server : in out Swagger.Servers.Application_Type'Class) is
      begin
         Swagger.Servers.Register (Server, API_Get_Ip.Definition);
      end Register;

      protected body Server is
         --  Get your public IP address
         procedure Get_Ip
            (Format : in Swagger.Nullable_UString;
             Callback : in Swagger.Nullable_UString;
             Result : out .Models.OneOfIpstring_Type;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Ip
               (Format,
                Callback,
                Result,
                Context);
         end Get_Ip;

      end Server;

   end Shared_Instance;

end .Skeletons;
