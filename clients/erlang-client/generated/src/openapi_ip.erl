-module(openapi_ip).

-export([encode/1]).

-export_type([openapi_ip/0]).

-type openapi_ip() ::
    #{ 'ip' := binary()
     }.

encode(#{ 'ip' := Ip
        }) ->
    #{ 'ip' => Ip
     }.
