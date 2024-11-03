# #openapi-ipify
#
##OpenAPI client for ipify, a simple public IP address API
#
#The version of the OpenAPI document: 5.3.1-pre.0
#Contact: blah+oapicf@cliffano.com
#Generated by: https://openapi-generator.tech
#Generator version: 7.9.0
#

require "../spec_helper"
require "json"
require "time"

# Unit tests for OpenAPIClient::DefaultApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe "DefaultApi" do
  describe "test an instance of DefaultApi" do
    it "should create an instance of DefaultApi" do
      api_instance = OpenAPIClient::DefaultApi.new
      # TODO expect(api_instance).to be_instance_of(OpenAPIClient::DefaultApi)
    end
  end

  # unit tests for get_ip
  # Get your public IP address
  # @param [Hash] opts the optional parameters
  # @option opts [String] :format Response format
  # @option opts [String] :callback JSONP callback function name
  # @return [String]
  describe "get_ip test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

end
