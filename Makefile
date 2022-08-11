version ?= 3.1.1
SPEC_URI=specification/ipify.yml

ci:
	make -f Makefile-swaggy-c ci \
	  SPEC_URI=${SPEC_URI} \
		GEN_BASE_DIR=/home/runner/work/openapi-ipify/openapi-ipify

clean:
	make -f Makefile-swaggy-c clean

generate-all:
	make -f Makefile-swaggy-c clean deps init-spec generate-all build-javascript build-python build-ruby test-javascript test-python test-ruby \
	  SPEC_URI=${SPEC_URI} \
		GEN_BASE_DIR=/Users/cliffano/dev/workspace-studio/openapi-ipify

generate-primary:
	make -f Makefile-swaggy-c clean deps init-spec generate-primary build-javascript build-python build-ruby test-javascript test-python test-ruby \
	  SPEC_URI=${SPEC_URI} \
		GEN_BASE_DIR=/Users/cliffano/dev/workspace-studio/openapi-ipify

publish-javascript:
	make --environment-overrides -f Makefile-swaggy-c publish-javascript

publish-python:
	make -f Makefile-swaggy-c publish-python

publish-ruby:
	make -f Makefile-swaggy-c publish-ruby

doc:
	make -f Makefile-swaggy-c deps init-spec doc-latest doc-version \
	  SPEC_URI=${SPEC_URI} \
		APP_VERSION=${version}

.PHONY: ci clean generate publish-javascript publish-python publish-ruby doc-publish