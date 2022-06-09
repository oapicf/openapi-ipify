# coding: utf-8

from typing import Dict, List  # noqa: F401

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    Path,
    Query,
    Response,
    Security,
    status,
)

from openapi_server.models.extra_models import TokenModel  # noqa: F401
from openapi_server.models.ip import Ip


router = APIRouter()


@router.get(
    "/",
    responses={
        200: {"model": Ip, "description": "Your public IP address"},
    },
    tags=["default"],
    summary="Get your public IP address",
    response_model_by_alias=True,
)
async def get_ip(
    format: str = Query(None, description="Response format"),
    param_callback: str = Query(None, description="JSONP callback function name"),
) -> Ip:
    ...
