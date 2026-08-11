require 'ipaddr'

# Load the gem
require 'openapi_ipify'

api_instance = OpenApiIpifyClient::DefaultApi.new

begin
  # Get the caller's IP address
  ip = api_instance.get_ip
  puts "API called successfully. Returned data: #{ip}"
rescue OpenApiIpifyClient::ApiError => e
  puts "Exception when calling DefaultApi->get_ip: #{e}"
  raise
end
