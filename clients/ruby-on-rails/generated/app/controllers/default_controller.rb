=begin
openapi-ipify

OpenAPI client for ipify, a simple public IP address API

The version of the OpenAPI document: 3.2.2-pre.0
Contact: blah@cliffano.com
Generated by: https://github.com/openapitools/openapi-generator.git

=end
class DefaultController < ApplicationController

  def get_ip
    # Your code here

    render json: {"message" => "yes, it worked"}
  end
end
