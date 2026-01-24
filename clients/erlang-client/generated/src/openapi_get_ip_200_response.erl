-module(openapi_get_ip_200_response).

-export([encode/1]).

-export_type([openapi_get_ip_200_response/0]).

-type openapi_get_ip_200_response() ::
    #{ 'ip' => binary()
     }.

encode(#{ 'ip' := Ip
        }) ->
    #{ 'ip' => Ip
     }.
