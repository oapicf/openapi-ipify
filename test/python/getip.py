import unittest
import openapiipify
from openapiipify.rest import ApiException
from pprint import pprint

class TestIpify(unittest.TestCase):

    def test_getip_with_jsonp_format_and_callback_function_name(self):

      configuration = openapiipify.Configuration(
          host = "https://api.ipify.org"
      )

      with openapiipify.ApiClient(configuration) as api_client:

          api_instance = openapiipify.DefaultApi(api_client)
          format = 'json'
          param_callback = 'param_callback_example'

          try:
              api_response = api_instance.get_ip(format=format, param_callback=param_callback)
              print('The response of DefaultApi->search:\n')
              pprint(api_response)
          except ApiException as e:
              self.fail('Exception when calling DefaultApi->search: %s\n' % e)