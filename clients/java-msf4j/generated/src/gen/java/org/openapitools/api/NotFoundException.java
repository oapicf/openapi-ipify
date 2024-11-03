package org.openapitools.api;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-03T00:27:51.994209091Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class NotFoundException extends ApiException {
    private int code;
    public NotFoundException (int code, String msg) {
        super(code, msg);
        this.code = code;
    }
}
