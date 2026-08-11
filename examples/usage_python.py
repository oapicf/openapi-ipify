import openapiipify
from openapiipify.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api64.ipify.org
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiipify.Configuration(
    host = "https://api64.ipify.org"
)

# Enter a context with an instance of the API client
with openapiipify.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiipify.DefaultApi(api_client)

    try:
        # Get the caller's IP address
        api_response = api_instance.get_ip()
        print("The response of DefaultApi->get_ip:\n")
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling DefaultApi->get_ip: %s\n" % e)
        raise
