# 

OpenAPI client for ipify, a simple public IP address API

This Groovy package, using the [http-builder-ng library](https://http-builder-ng.github.io/http-builder-ng/), is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0-pre.0
- Package version: 1.0.0-pre.0
- Build date: 2022-03-05T14:53:40.114127Z[Etc/UTC]
- Build package: org.openapitools.codegen.languages.GroovyClientCodegen
For more information, please visit [http://blog.cliffano.com](http://blog.cliffano.com)

## Requirements

* Groovy 2.5.7
* Gradle 4.9

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

## Getting Started


```groovy
def apiInstance = new DefaultApi()
def format = "json" // String | Response format
def paramCallback = "paramCallback_example" // String | JSONP callback function name

apiInstance.getIp(format, paramCallback)
    {
    // on success
    def result = (Ip)it
    println result
    
}
    {
    // on failure
    statusCode, message ->
        println "${statusCode} ${message}"
};
```
