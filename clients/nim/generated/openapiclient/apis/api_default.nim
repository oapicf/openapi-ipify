#
# openapi-ipify
# 
# OpenAPI client for ipify, a simple public IP address API
# The version of the OpenAPI document: 3.0.1-pre.0
# Contact: blah@cliffano.com
# Generated by: https://openapi-generator.tech
#

import httpclient
import json
import logging
import marshal
import options
import strformat
import strutils
import tables
import typetraits
import uri

import ../models/model_ip

const basepath = "https://api.ipify.org"

template constructResult[T](response: Response): untyped =
  if response.code in {Http200, Http201, Http202, Http204, Http206}:
    try:
      when name(stripGenericParams(T.typedesc).typedesc) == name(Table):
        (some(json.to(parseJson(response.body), T.typedesc)), response)
      else:
        (some(marshal.to[T](response.body)), response)
    except JsonParsingError:
      # The server returned a malformed response though the response code is 2XX
      # TODO: need better error handling
      error("JsonParsingError")
      (none(T.typedesc), response)
  else:
    (none(T.typedesc), response)


proc getIp*(httpClient: HttpClient, format: string, callback: string): (Option[Ip], Response) =
  ## Get your public IP address
  let query_for_api_call = encodeQuery([
    ("format", $format), # Response format
    ("callback", $callback), # JSONP callback function name
  ])

  let response = httpClient.get(basepath & "/" & "?" & query_for_api_call)
  constructResult[Ip](response)

