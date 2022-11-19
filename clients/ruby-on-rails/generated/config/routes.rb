=begin
openapi-ipify

OpenAPI client for ipify, a simple public IP address API

The version of the OpenAPI document: 3.2.2-pre.0
Contact: blah@cliffano.com
Generated by: https://github.com/openapitools/openapi-generator.git

=end
Rails.application.routes.draw do

  def add_openapi_route http_method, path, opts = {}
    full_path = path.gsub(/{(.*?)}/, ':\1')
    match full_path, to: "#{opts.fetch(:controller_name)}##{opts[:action_name]}", via: http_method
  end

  add_openapi_route 'GET', '/', controller_name: 'default', action_name: 'get_ip'
end
