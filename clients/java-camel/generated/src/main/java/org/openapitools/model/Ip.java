package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Ip
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2023-09-09T05:58:06.879978Z[Etc/UTC]")
public class Ip {

  private String ip;

  /**
   * Default constructor
   * @deprecated Use {@link Ip#Ip(String)}
   */
  @Deprecated
  public Ip() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
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
  */
  @NotNull 
  @Schema(name = "ip", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ip")
  public String getIp() {
    return ip;
  }

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

