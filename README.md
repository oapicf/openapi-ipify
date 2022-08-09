<img align="right" src="https://raw.github.com/cliffano/openapi-ipify/master/avatar.jpg" alt="Avatar"/>

[![Build Status](https://github.com/cliffano/openapi-ipify/actions/workflows/ci-workflow.yaml/badge.svg)](https://github.com/cliffano/openapi-ipify/actions/workflows/ci-workflow.yaml)
<br/>

OpenAPI ipify
-------------

OpenAPI ipify is an OpenAPI v3 specification and a set of generated API clients for [ipify](https://www.ipify.org/)

The API clients are generated using [OpenAPI Generator](https://openapi-generator.tech/).

Published packages
------------------

| Language | Package | Status |
|----------|---------|--------|
| JavaScript | [openapi_ipify]((http://www.npmjs.com/package/openapi_ipify)) | [![Published Version](https://img.shields.io/npm/v/openapi_ipify.svg)](http://www.npmjs.com/package/openapi_ipify) |
| Python | [openapiipify]((https://pypi.python.org/pypi/openapiipify)) | [![Published Version](https://img.shields.io/pypi/v/openapiipify.svg)](https://pypi.python.org/pypi/openapiipify) |
| Ruby | [openapi_ipify]((https://rubygems.org/gems/openapi_ipify)) | [![Published Version](https://img.shields.io/gem/v/openapi_ipify.svg)](https://rubygems.org/gems/openapi_ipify) |

Version matrix
--------------

| OpenAPI Ipify Version | OpenAPI Version | OpenAPI Generator Version |
|-----------------------|-----------------|---------------------------|
| 3.0.0 | 3.0.0 | 6.0.0 |
| 2.0.0 | 3.0.0 | 5.4.0 |

Usage
-----

Generate API clients for languages supported by OpenAPI Generator:

    make generate-all GEN_BASE_DIR=<path/to/openapi-ipify>

Installation
------------

You can either use the generated clients from `clients/<lang>/generated/` directory.

Or you can use the published packages like below:

Install JavaScript client:

    npm install openapi-ipify

Install Python client:

    pip install openapiipify

Install Ruby client:

    gem install openapi_ipify

Colophon
--------

* [API Documentation](http://cliffano.github.io/openapi-ipify/api/latest/)
