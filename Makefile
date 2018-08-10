LANGS = ada ada-server android apache2 apex aspnetcore bash clojure cwiki cpp-qt5 cpp-qt5-qhttpengine-server cpp-pistache-server cpp-restbed-server cpp-restsdk cpp-tizen csharp csharp-dotnet2 csharp-nancyfx dart eiffel elixir elm erlang-client erlang-server flash scala-finch go go-server groovy kotlin kotlin-server haskell-http-client haskell java jaxrs-cxf-client java-inflector java-msf4j java-pkmst java-play-framework java-undertow-server java-vertx jaxrs-cxf jaxrs-cxf-cdi jaxrs-jersey jaxrs-resteasy jaxrs-resteasy-eap jaxrs-spec javascript javascript-flowtyped javascript-closure-angular jmeter lua nodejs-server objc openapi openapi-yaml perl php php-laravel php-lumen php-slim php-silex php-symfony php-ze-ph powershell python python-flask r ruby ruby-on-rails ruby-sinatra rust rust-server scalatra scala-akka scala-httpclient scala-gatling scala-lagom-server scalaz spring dynamic-html html html2 swift2-deprecated swift3 swift4 typescript-angular typescript-angularjs typescript-aurelia typescript-fetch typescript-inversify typescript-jquery typescript-node
LANGS = javascript

ci: clean deps tools generate test-ci doc

clean:
	rm -rf generated

deps:
	docker pull openapitools/openapi-generator-cli:v3.2.0

tools:
	npm install -g bootprint bootprint-openapi gh-pages mocha

generate:
	for lang in ${LANGS} ; do \
	  docker \
		  run \
		  --rm \
		  -v ${PWD}:/local openapitools/openapi-generator-cli \
		  generate \
		  --input-spec /local/specification/ipify.yaml \
		  --generator-name $$lang \
		  --output /local/generated/$$lang; \
	done

test:
	cd generated/javascript && npm link
	cd test/javascript && npm link ipify
	mocha --timeout 5000 test/javascript/

test-ci:
	ls -alrth generated/
	ls -alrth generated/javascript/
	npm --version
	whoami
	pwd
	cd generated/javascript
	echo "post cd"
	cd generated/javascript && npm link
	cd test/javascript && npm link ipify
	mocha --timeout 5000 test/javascript/

doc:
	bootprint openapi specification/ipify.yaml doc/api/latest/

doc-publish:
	gh-pages --dist doc/

.PHONY: clean deps tools generate test doc doc-publish
