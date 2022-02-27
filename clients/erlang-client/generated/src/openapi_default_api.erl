-module(openapi_default_api).

-export([get_ip/1, get_ip/2]).

-define(BASE_URL, <<"">>).

%% @doc Get your public IP address
%% 
-spec get_ip(ctx:ctx()) -> {ok, openapi_one_of<ip,string>:openapi_one_of<ip,string>(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_ip(Ctx) ->
    get_ip(Ctx, #{}).

-spec get_ip(ctx:ctx(), maps:map()) -> {ok, openapi_one_of<ip,string>:openapi_one_of<ip,string>(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_ip(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['format', 'callback'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


