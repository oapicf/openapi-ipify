{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE NoImplicitPrelude          #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module OpenapiIpify.Types (
  GetIp200Response (..),
  ) where

import ClassyPrelude.Yesod
import Data.Foldable (foldl)
import qualified Data.List as List
import Data.Maybe (fromMaybe)
import Data.Aeson (Value, FromJSON(..), ToJSON(..), genericToJSON, genericParseJSON)
import Data.Aeson.Types (Options(..), defaultOptions)
import qualified Data.Char as Char
import qualified Data.Text as T
import qualified Data.Map as Map
import GHC.Generics (Generic)


-- | 
data GetIp200Response = GetIp200Response
  { getIp200ResponseIp :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetIp200Response where
  parseJSON = genericParseJSON optionsGetIp200Response
instance ToJSON GetIp200Response where
  toJSON = genericToJSON optionsGetIp200Response

optionsGetIp200Response :: Options
optionsGetIp200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getIp200ResponseIp", "ip")
      ]

