# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.default_api_base import BaseDefaultApi
import openapi_server.impl

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    HTTPException,
    Path,
    Query,
    Response,
    Security,
    status,
)

from openapi_server.models.extra_models import TokenModel  # noqa: F401
from pydantic import Field, StrictStr, field_validator
from typing import Optional
from typing_extensions import Annotated


router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/",
    responses={
        200: {"model": str, "description": "Your public IP address"},
    },
    tags=["default"],
    summary="Get your public IP address",
    response_model_by_alias=True,
)
async def get_ip(
    format: Annotated[Optional[StrictStr], Field(description="Response format")] = Query(None, description="Response format", alias="format"),
    param_callback: Annotated[Optional[StrictStr], Field(description="JSONP callback function name")] = Query(None, description="JSONP callback function name", alias="callback"),
) -> str:
    if not BaseDefaultApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseDefaultApi.subclasses[0]().get_ip(format, param_callback)
