require 'ipaddr'
require 'time'
require 'openapi_ipify'

describe 'IpifyClient' do
  before do
  end

  after do
  end

  describe 'test without format' do
    it 'should return IP address in plain text' do
      api_instance = OpenApiIpifyClient::DefaultApi.new
      begin
        ip = api_instance.get_ip
        expect(ip).not_to be_nil
        IPAddr.new(ip)
      rescue OpenApiIpifyClient::ApiError => e
        puts "Error when calling DefaultApi->get_ip: #{e}"
        fail
      end
    end
  end

  describe 'test with JSON format' do
    it 'should return IP address within an object' do
      api_instance = OpenApiIpifyClient::DefaultApi.new
      begin
        opts = {
          format: 'json'
        }
        data = api_instance.get_ip(opts)
        expect(data).not_to be_nil
        parsed_data = JSON.parse(data)
        ip = parsed_data['ip']
        expect(ip).not_to be_nil
        IPAddr.new(ip)
      rescue OpenApiIpifyClient::ApiError => e
        puts "Error when calling DefaultApi->get_ip: #{e}"
        fail
      end
    end
  end

  describe 'test with JSONP format' do
    it 'should return IP address as function string' do
      api_instance = OpenApiIpifyClient::DefaultApi.new
      begin
        opts = {
          format: 'jsonp'
        }
        data = api_instance.get_ip(opts)
        expect(data).not_to be_nil
        payload = data.match(/^callback\((.*)\);?$/)[1]
        parsed_data = JSON.parse(payload)
        ip = parsed_data['ip']
        expect(ip).not_to be_nil
        IPAddr.new(ip)
      rescue OpenApiIpifyClient::ApiError => e
        puts "Error when calling DefaultApi->get_ip: #{e}"
        fail
      end
    end
  end

    describe 'test with JSONP format and callback function name' do
    it 'should return IP address as function string' do
      api_instance = OpenApiIpifyClient::DefaultApi.new
      begin
        opts = {
          format: 'jsonp',
          callback: 'foobar'
        }
        data = api_instance.get_ip(opts)
        expect(data).not_to be_nil
        payload = data.match(/^foobar\((.*)\);?$/)[1]
        parsed_data = JSON.parse(payload)
        ip = parsed_data['ip']
        expect(ip).not_to be_nil
        IPAddr.new(ip)
      rescue OpenApiIpifyClient::ApiError => e
        puts "Error when calling DefaultApi->get_ip: #{e}"
        fail
      end
    end
  end

end