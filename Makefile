version ?= 3.1.2-pre.0
SPEC_URI=specification/ipify.yml

ifdef GITHUB_ACTIONS
GEN_BASE_DIR=/home/runner/work/openapi-ipify/openapi-ipify
else
GEN_BASE_DIR=/Users/cliffano/dev/workspace-studio/openapi-ipify
endif

ci:
	make -f Makefile-swaggy-c ci \
	  SPEC_URI=${SPEC_URI} \
		GEN_BASE_DIR=${GEN_BASE_DIR}

clean:
	make -f Makefile-swaggy-c clean

generate-all:
	make -f Makefile-swaggy-c clean deps init-spec generate-all build-javascript build-python build-ruby test-javascript test-python test-ruby \
	  SPEC_URI=${SPEC_URI} \
		GEN_BASE_DIR=${GEN_BASE_DIR}

generate-primary:
	make -f Makefile-swaggy-c clean deps init-spec generate-primary build-javascript build-python build-ruby test-javascript test-python test-ruby \
	  SPEC_URI=${SPEC_URI} \
		GEN_BASE_DIR=${GEN_BASE_DIR}

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