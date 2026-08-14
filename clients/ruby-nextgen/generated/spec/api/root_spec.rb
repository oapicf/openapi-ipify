# frozen_string_literal: true

require 'spec_helper'

RSpec.describe OpenapiClient::Api::Root do
  let(:client) { OpenapiClient::Client.new(base_url: 'https://api64.ipify.org') }

  it 'is reachable and shares the client connection' do
    api = described_class.new(client.connection)
    expect(api).to be_a(described_class)
  end
end
