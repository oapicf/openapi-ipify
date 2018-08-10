# Auto-Generated OpenAPI Bindings to `Ipify`

The library in `lib` provides auto-generated-from-OpenAPI bindings to the Ipify API.

## Installation

Installation follows the standard approach to installing Stack-based projects.

1. Install the [Haskell `stack` tool](http://docs.haskellstack.org/en/stable/README).
2. Run `stack install` to install this package.

## Main Interface

The main interface to this library is in the `Ipify.API` module, which exports the IpifyBackend type. The IpifyBackend
type can be used to create and define servers and clients for the API.

## Creating a Client

A client can be created via the `createIpifyClient` function, which, if provided with a hostname and a port, will generate
a client that can be used to access the API if it is being served at that hostname / port combination. For example, if
`localhost:8080` is serving the Ipify API, you can write:

```haskell
{-# LANGUAGE RecordWildCards #-}

import Ipify.API

main :: IO ()
main = do
  IpifyBackend{..} <- createIpifyClient (ServerConfig "localhost" 8080)
  -- Any Ipify API call can go here.
  return ()
```

## Creating a Server

In order to create a server, you must use the `runIpifyServer` function. However, you unlike the client, in which case you *got* a `IpifyBackend`
from the library, you must instead *provide* a `IpifyBackend`. For example, if you have defined handler functions for all the
functions in `Ipify.Handlers`, you can write:

```haskell
{-# LANGUAGE RecordWildCards #-}

import Ipify.API

-- A module you wrote yourself, containing all handlers needed for the IpifyBackend type.
import Ipify.Handlers

-- Run a Ipify server on localhost:8080
main :: IO ()
main = do
  let server = IpifyBackend{..}
  runIpifyServer (ServerConfig "localhost" 8080) server
```

You could use `optparse-applicative` or a similar library to read the host and port from command-line arguments:
```
{-# LANGUAGE RecordWildCards #-}

module Main (main) where

import Ipify.API (runIpifyServer, IpifyBackend(..), ServerConfig(..))

import Control.Applicative ((<$>), (<*>))
import Options.Applicative (execParser, option, str, auto, long, metavar, help)

main :: IO ()
main = do
  config <- parseArguments
  runIpifyServer config IpifyBackend{}

-- | Parse host and port from the command line arguments.
parseArguments :: IO ServerConfig
parseArguments =
  execParser $
    ServerConfig
      <$> option str  (long "host" <> metavar "HOST" <> help "Host to serve on")
      <*> option auto (long "port" <> metavar "PORT" <> help "Port to serve on")
```
