=begin comment

openapi-ipify

OpenAPI client for ipify, a simple public IP address API

The version of the OpenAPI document: 3.0.1-pre.0
Contact: blah@cliffano.com
Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator
# Please update the test cases below to test the API endpoints.
# Ref: https://openapi-generator.tech
#
use Test::More tests => 1; #TODO update number of test cases
use Test::Exception;

use lib 'lib';
use strict;
use warnings;

use_ok('WWW::OpenAPIClient::DefaultApi');

my $api = WWW::OpenAPIClient::DefaultApi->new();
isa_ok($api, 'WWW::OpenAPIClient::DefaultApi');

#
# get_ip test
#
# uncomment below and update the test
#my $get_ip_format = undef; # replace NULL with a proper value
#my $get_ip_callback = undef; # replace NULL with a proper value
#my $get_ip_result = $api->get_ip(format => $get_ip_format, callback => $get_ip_callback);

