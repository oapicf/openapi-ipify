import unittest

from flask import json

from openapi_server.models.ip import Ip  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDefaultController(BaseTestCase):
    """DefaultController integration test stubs"""

    def test_get_ip(self):
        """Test case for get_ip

        Get your public IP address
        """
        query_string = [('format', 'format_example'),
                        ('callback', 'param_callback_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
