/*
 * openapi-ipify
 * OpenAPI client for ipify, a simple public IP address API
 *
 * The version of the OpenAPI document: 2.0.1-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Ip
 */
@JsonPropertyOrder({
  Ip.JSON_PROPERTY_IP
})
@JsonTypeName("Ip")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-06-09T11:13:48.265929Z[Etc/UTC]")
@Introspected
public class Ip {
    public static final String JSON_PROPERTY_IP = "ip";
    private String ip;

    public Ip(String ip) {
        this.ip = ip;
    }

    public Ip ip(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * Get ip
     * @return ip
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_IP)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getIp() {
        return ip;
    }

    @JsonProperty(JSON_PROPERTY_IP)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ip ip = (Ip) o;
        return Objects.equals(this.ip, ip.ip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Ip {\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
