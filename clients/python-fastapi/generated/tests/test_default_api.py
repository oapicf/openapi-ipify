# coding: utf-8

from fastapi.testclient import TestClient


from openapi_server.models.ip import Ip  # noqa: F401
from openapi_server.models.one_of_ipstring import OneOfIpstring  # noqa: F401


def test_get_ip(client: TestClient):
    """Test case for get_ip

    Get your public IP address
    """
    params = [("format", 'format_example'),     ("param_callback", 'param_callback_example')]
    headers = {
    }
    response = client.request(
        "GET",
        "/",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

