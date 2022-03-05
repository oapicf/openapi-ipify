from typing import List, Dict
from aiohttp import web

from openapi_server.models.ip import Ip
from openapi_server import util


async def get_ip(request: web.Request, format=None, param_callback=None) -> web.Response:
    """Get your public IP address

    

    :param format: Response format
    :type format: str
    :param param_callback: JSONP callback function name
    :type param_callback: str

    """
    return web.Response(status=200)
