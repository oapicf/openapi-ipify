import unittest
import json
import openapiipify
import validators
from openapiipify.rest import ApiException
from pprint import pprint

class TestIpify(unittest.TestCase):

    def test_getip_without_format(self):

      configuration = openapiipify.Configuration(
          host = "https://api.ipify.org"
      )

      with openapiipify.ApiClient(configuration) as api_client:

          api_instance = openapiipify.DefaultApi(api_client)

          try:
              api_response = api_instance.get_ip()
              assert api_response != None
              assert type(api_response) == str
              assert validators.ipv4(api_response) == True
          except ApiException as e:
              self.fail('Exception when calling DefaultApi->search: %s\n' % e)

    def test_getip_with_json_format(self):

      configuration = openapiipify.Configuration(
          host = "https://api.ipify.org"
      )

      with openapiipify.ApiClient(configuration) as api_client:

          api_instance = openapiipify.DefaultApi(api_client)
          format = 'json'

          try:
              api_response = api_instance.get_ip(format=format)
              assert api_response != None
              assert type(api_response) == str
              assert validators.ipv4(json.loads(api_response)['ip']) == True
          except ApiException as e:
              self.fail('Exception when calling DefaultApi->search: %s\n' % e)

    def test_getip_with_jsonp_format(self):

      configuration = openapiipify.Configuration(
          host = "https://api.ipify.org"
      )

      with openapiipify.ApiClient(configuration) as api_client:

          api_instance = openapiipify.DefaultApi(api_client)
          format = 'jsonp'

          try:
              api_response = api_instance.get_ip(format=format)
              assert api_response != None
              assert type(api_response) == str
              payload = api_response.split('(')[1].split(')')[0]
              assert validators.ipv4(json.loads(payload)['ip']) == True
          except ApiException as e:
              self.fail('Exception when calling DefaultApi->search: %s\n' % e)

    def test_getip_with_jsonp_format_and_callback_function_name(self):

      configuration = openapiipify.Configuration(
          host = "https://api.ipify.org"
      )

      with openapiipify.ApiClient(configuration) as api_client:

          api_instance = openapiipify.DefaultApi(api_client)
          format = 'jsonp'
          param_callback = 'foobar'

          try:
              api_response = api_instance.get_ip(format=format, param_callback=param_callback)
              assert api_response != None
              assert type(api_response) == str
              payload = api_response.split('(')[1].split(')')[0]
              assert validators.ipv4(json.loads(payload)['ip']) == True
          except ApiException as e:
              self.fail('Exception when calling DefaultApi->search: %s\n' % e)
