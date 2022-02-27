-module(openapi_api).

-export([ get_ip/0
        ]).

-define(BASE_URL, "").

%% @doc Get your public IP address
%% 
-spec get_ip() ->
  openapi_utils:response().
get_ip() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/"],
  QueryString = [<<"format=">>, Format, <<"&">>, <<"callback=">>, Callback, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

