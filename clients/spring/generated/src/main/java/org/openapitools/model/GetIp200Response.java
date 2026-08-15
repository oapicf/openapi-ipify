package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GetIp200Response
 */

@JsonTypeName("getIp_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-15T01:59:48.977526828Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class GetIp200Response {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String ip;

  public GetIp200Response ip(@Nullable String ip) {
    this.ip = ip;
    return this;
  }

  /**
   * Get ip
   * @return ip
   */
  
  @Schema(name = "ip", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ip")
  public @Nullable String getIp() {
    return ip;
  }

  @JsonProperty("ip")
  public void setIp(@Nullable String ip) {
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
    GetIp200Response getIp200Response = (GetIp200Response) o;
    return Objects.equals(this.ip, getIp200Response.ip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetIp200Response {\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

