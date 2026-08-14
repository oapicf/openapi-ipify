require "json"

module OpenAPIClient
  module Api
  class Root
    def initialize(@conn : Connection); end

    # Get your public IP address
    def list(*, format : String? = nil, callback : String? = nil) : Response(String)
      @conn.request(String,
        method: :GET,
        path: "/",
        query: { "format" => format, "callback" => callback },
        accept: %w[text/plain application/json application/javascript],
        auth: %w[])
    end
  end
  end

end
