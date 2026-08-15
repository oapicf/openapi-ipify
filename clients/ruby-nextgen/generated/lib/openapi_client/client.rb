# frozen_string_literal: true

module OpenapiClient
  class Client
    attr_reader :configuration, :connection

    def initialize(base_url: nil, **options, &block)
      @configuration = Configuration.new(base_url: base_url, **options, &block)
      @connection = Connection.new(@configuration)
    end

    def root
      @root ||= OpenapiClient::Api::Root.new(@connection)
    end
  end
end
