# frozen_string_literal: true

module OpenapiClient
  module Api
    class Root
      def initialize(connection)
        @connection = connection
      end

      def list(format: nil, callback: nil)
        @connection.call(
          :GET,
          '/',
          type: nil,
          auth: [],
          query: { 'format' => format, 'callback' => callback }
        )
      end
    end
  end
end
