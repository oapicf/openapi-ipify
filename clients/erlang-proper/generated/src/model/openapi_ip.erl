-module(openapi_ip).

-include("openapi.hrl").

-export([openapi_ip/0]).

-export([openapi_ip/1]).

-export_type([openapi_ip/0]).

-type openapi_ip() ::
  [ {'ip', binary() }
  ].


openapi_ip() ->
    openapi_ip([]).

openapi_ip(Fields) ->
  Default = [ {'ip', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

