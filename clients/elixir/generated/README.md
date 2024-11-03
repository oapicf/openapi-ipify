# OpenapiIpify

OpenAPI client for ipify, a simple public IP address API

## Building

To install the required dependencies and to build the elixir project, run:

```console
mix local.hex --force
mix do deps.get, compile
```

## Installation

If [available in Hex][], the package can be installed by adding `openapi_ipify` to
your list of dependencies in `mix.exs`:

```elixir
def deps do
  [{:openapi_ipify, "~> 1.0.0"}]
end
```

Documentation can be generated with [ExDoc][] and published on [HexDocs][]. Once published, the docs can be found at
[https://hexdocs.pm/openapi_ipify][docs].

## Configuration

You can override the URL of your server (e.g. if you have a separate development and production server in your
configuration files).

```elixir
config :openapi_ipify, base_url: "https://api.ipify.org"
```

Multiple clients for the same API with different URLs can be created passing different `base_url`s when calling
`OpenapiIpify.Connection.new/1`:

```elixir
client = OpenapiIpify.Connection.new(base_url: "https://api.ipify.org")
```

[exdoc]: https://github.com/elixir-lang/ex_doc
[hexdocs]: https://hexdocs.pm
[available in hex]: https://hex.pm/docs/publish
[docs]: https://hexdocs.pm/openapi_ipify
