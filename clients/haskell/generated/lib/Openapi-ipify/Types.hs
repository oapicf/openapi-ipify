{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE DeriveDataTypeable         #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE DuplicateRecordFields      #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module Openapi-ipify.Types (
  GetIp200Response (..),
  ) where

import Data.Data (Data)
import Data.UUID (UUID)
import Data.List (lookup)
import Data.Maybe (fromMaybe)
import Data.Aeson (Value, FromJSON(..), ToJSON(..), genericToJSON, genericParseJSON)
import Data.Aeson.Types (Options(..), defaultOptions)
import Data.Set (Set)
import Data.Text (Text)
import Data.Time
import Data.Swagger (ToSchema, declareNamedSchema)
import qualified Data.Swagger as Swagger
import qualified Data.Char as Char
import qualified Data.Text as T
import qualified Data.Map as Map
import GHC.Generics (Generic)


-- | 
data GetIp200Response = GetIp200Response
  { getIp200ResponseIp :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON GetIp200Response where
  parseJSON = genericParseJSON optionsGetIp200Response
instance ToJSON GetIp200Response where
  toJSON = genericToJSON optionsGetIp200Response
instance ToSchema GetIp200Response where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ optionsGetIp200Response

optionsGetIp200Response :: Options
optionsGetIp200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("getIp200ResponseIp", "ip")
      ]

