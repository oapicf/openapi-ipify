#
# openapi-ipify
# 
# OpenAPI client for ipify, a simple public IP address API
# The version of the OpenAPI document: 5.3.1-pre.0
# Contact: blah+oapicf@cliffano.com
# Generated by: https://openapi-generator.tech
#

import httpclient
import logging
import options

import openapiclient

import config

let logger = newConsoleLogger()
addHandler(logger)

let client = newHttpClient()
client.headers["User-Agent"] = config.useragent
