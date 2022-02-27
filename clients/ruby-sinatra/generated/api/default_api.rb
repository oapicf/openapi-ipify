require 'json'


MyApp.add_route('GET', '/', {
  "resourcePath" => "/Default",
  "summary" => "Get your public IP address",
  "nickname" => "get_ip",
  "responseClass" => "oneOf<Ip,string>",
  "endpoint" => "/",
  "notes" => "",
  "parameters" => [
    {
      "name" => "format",
      "description" => "Response format",
      "dataType" => "String",
      "allowableValues" => "[json, jsonp]",
      "paramType" => "query",
    },
    {
      "name" => "callback",
      "description" => "JSONP callback function name",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

