=begin
#openapi-ipify

#OpenAPI client for ipify, a simple public IP address API

The version of the OpenAPI document: 4.0.1-pre.0
Contact: blah@cliffano.com
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 7.0.0

=end

require 'spec_helper'

describe OpenApiIpifyClient::Configuration do
  let(:config) { OpenApiIpifyClient::Configuration.default }

  before(:each) do
    # uncomment below to setup host and base_path
    # require 'URI'
    # uri = URI.parse("https://api.ipify.org")
    # OpenApiIpifyClient.configure do |c|
    #   c.host = uri.host
    #   c.base_path = uri.path
    # end
  end

  describe '#base_url' do
    it 'should have the default value' do
      # uncomment below to test default value of the base path
      # expect(config.base_url).to eq("https://api.ipify.org")
    end

    it 'should remove trailing slashes' do
      [nil, '', '/', '//'].each do |base_path|
        config.base_path = base_path
        # uncomment below to test trailing slashes
        # expect(config.base_url).to eq("https://api.ipify.org")
      end
    end
  end
end
