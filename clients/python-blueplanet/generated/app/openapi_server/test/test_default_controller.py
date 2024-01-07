# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.ip import Ip  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDefaultController(BaseTestCase):
    """DefaultController integration test stubs"""

    def test_get_ip(self):
        """Test case for get_ip

        Get your public IP address
        """
        query_string = [('format', 'format_example'),
                        ('param_callback', 'param_callback_example')]
        response = self.client.open(
            '/',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
