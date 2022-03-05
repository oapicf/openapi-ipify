# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.ip import Ip


async def test_get_ip(client):
    """Test case for get_ip

    Get your public IP address
    """
    params = [('format', 'format_example'),
                    ('callback', 'param_callback_example')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

