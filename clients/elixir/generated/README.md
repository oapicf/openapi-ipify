# OpenapiIpify

OpenAPI client for ipify, a simple public IP address API

### Building

To install the required dependencies and to build the elixir project, run:
```
mix local.hex --force
mix do deps.get, compile
```

## Installation

If [available in Hex](https://hex.pm/docs/publish), the package can be installed
by adding `openapi_ipify` to your list of dependencies in `mix.exs`:

```elixir
def deps do
  [{:openapi_ipify, "~> 0.1.0"}]
end
```

Documentation can be generated with [ExDoc](https://github.com/elixir-lang/ex_doc)
and published on [HexDocs](https://hexdocs.pm). Once published, the docs can
be found at [https://hexdocs.pm/openapi_ipify](https://hexdocs.pm/openapi_ipify).


## Configuration

You can override the URL of your server (e.g. if you have a separate development and production server in your configuration files.
```elixir
config :openapi_ipify, base_url: "https://api.ipify.org"
```