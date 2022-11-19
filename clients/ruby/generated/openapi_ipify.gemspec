# -*- encoding: utf-8 -*-

=begin
#openapi-ipify

#OpenAPI client for ipify, a simple public IP address API

The version of the OpenAPI document: 3.2.2-pre.0
Contact: blah@cliffano.com
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

$:.push File.expand_path("../lib", __FILE__)
require "openapi_ipify/version"

Gem::Specification.new do |s|
  s.name        = "openapi_ipify"
  s.version     = OpenApiIpifyClient::VERSION
  s.platform    = Gem::Platform::RUBY
  s.authors     = ["Cliffano Subagio"]
  s.email       = ["blah@cliffano.com"]
  s.homepage    = "https://github.com/cliffano/openapi-ipify"
  s.summary     = "openapi-ipify Ruby Gem"
  s.description = "OpenAPI client for ipify, a simple public IP address API"
  s.license     = "MIT"
  s.required_ruby_version = ">= 2.0"

  s.add_runtime_dependency 'typhoeus', '~> 1.0', '>= 1.0.1'

  s.add_development_dependency 'rspec', '~> 3.6', '>= 3.6.0'

  s.files         = `find *`.split("\n").uniq.sort.select { |f| !f.empty? }
  s.test_files    = `find spec/*`.split("\n")
  s.executables   = []
  s.require_paths = ["lib"]
end
