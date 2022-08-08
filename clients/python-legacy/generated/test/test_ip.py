# coding: utf-8

"""
    openapi-ipify

    OpenAPI client for ipify, a simple public IP address API  # noqa: E501

    The version of the OpenAPI document: 3.0.1-pre.0
    Contact: blah@cliffano.com
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest
import datetime

import openapi_client
from openapi_client.models.ip import Ip  # noqa: E501
from openapi_client.rest import ApiException

class TestIp(unittest.TestCase):
    """Ip unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test Ip
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.ip.Ip()  # noqa: E501
        if include_optional :
            return Ip(
                ip = ''
            )
        else :
            return Ip(
                ip = '',
        )

    def testIp(self):
        """Test Ip"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
