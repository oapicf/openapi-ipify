# coding: utf-8

"""
    openapi-ipify

    OpenAPI client for ipify, a simple public IP address API  # noqa: E501

    The version of the OpenAPI document: 1.0.0-pre.0
    Contact: blah@cliffano.com
    Generated by: https://openapi-generator.tech
"""

import unittest

import openapi_client
from openapi_client.api.default_api import DefaultApi  # noqa: E501


class TestDefaultApi(unittest.TestCase):
    """DefaultApi unit test stubs"""

    def setUp(self):
        self.api = DefaultApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_ip(self):
        """Test case for get_ip

        Get your public IP address  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
