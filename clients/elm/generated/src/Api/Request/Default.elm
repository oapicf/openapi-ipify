{-
   openapi-ipify
   OpenAPI client for ipify, a simple public IP address API

   The version of the OpenAPI document: 1.0.0-pre.0
   Contact: blah@cliffano.com

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git

   DO NOT EDIT THIS FILE MANUALLY.

   For more info on generating Elm code, see https://eriktim.github.io/openapi-elm/
-}


module Api.Request.Default exposing
    ( getIp, Format(..), formatVariants
    )

import Api
import Api.Data
import Dict
import Http
import Json.Decode
import Json.Encode


type Format
    = FormatJson
    | FormatJsonp


formatVariants : List Format
formatVariants =
    [ FormatJson
    , FormatJsonp
    ]


stringFromFormat : Format -> String
stringFromFormat model =
    case model of
        FormatJson ->
            "json"

        FormatJsonp ->
            "jsonp"





getIp : Maybe Format -> Maybe String -> Api.Request Api.Data.Ip
getIp format_query callback_query =
    Api.request
        "GET"
        "/"
        []
        [ ( "format", Maybe.map stringFromFormat format_query ), ( "callback", Maybe.map identity callback_query ) ]
        []
        Nothing
        Api.Data.ipDecoder
