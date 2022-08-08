# coding: utf-8

"""
    openapi-ipify

    OpenAPI client for ipify, a simple public IP address API

    The version of the OpenAPI document: 3.0.1-pre.0
    Contact: blah@cliffano.com
    Generated by: https://openapi-generator.tech
"""


from fastapi import FastAPI

from openapi_server.apis.default_api import router as DefaultApiRouter

app = FastAPI(
    title="openapi-ipify",
    description="OpenAPI client for ipify, a simple public IP address API",
    version="3.0.1-pre.0",
)

app.include_router(DefaultApiRouter)
