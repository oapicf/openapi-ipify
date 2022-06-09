# #openapi-ipify
#
##OpenAPI client for ipify, a simple public IP address API
#
#The version of the OpenAPI document: 2.0.1-pre.0
#Contact: blah@cliffano.com
#Generated by: https://openapi-generator.tech
#OpenAPI Generator version: 6.0.0
#

require "uri"

module 
  class DefaultApi
    property api_client : ApiClient

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Get your public IP address
    # @return [Ip]
    def get_ip(format : String?, callback : String?)
      data, _status_code, _headers = get_ip_with_http_info(format, callback)
      data
    end

    # Get your public IP address
    # @return [Array<(Ip, Integer, Hash)>] Ip data, response status code and response headers
    def get_ip_with_http_info(format : String?, callback : String?)
      if @api_client.config.debugging
        Log.debug {"Calling API: DefaultApi.get_ip ..."}
      end
      allowable_values = ["json", "jsonp"]
      if @api_client.config.client_side_validation && format && !allowable_values.includes?(format)
        raise ArgumentError.new("invalid value for \"format\", must be one of #{allowable_values}")
      end
      # resource path
      local_var_path = "/"

      # query parameters
      query_params = Hash(String, String).new
      query_params["format"] = format.to_s unless format.nil?
      query_params["callback"] = callback.to_s unless callback.nil?

      # header parameters
      header_params = Hash(String, String).new
      # HTTP header "Accept" (if needed)
      header_params["Accept"] = @api_client.select_header_accept(["application/json", "application/javascript", "text/plain"])

      # form parameters
      form_params = Hash(Symbol, (String | ::File)).new

      # http body (model)
      post_body = nil

      # return_type
      return_type = "Ip"

      # auth_names
      auth_names = [] of String

      data, status_code, headers = @api_client.call_api(:GET,
                                                        local_var_path,
                                                        :"DefaultApi.get_ip",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: DefaultApi#get_ip\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return Ip.from_json(data), status_code, headers
    end
  end
end
