package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2023-03-04T02:34:10.130704Z[Etc/UTC]")
public class Ip   {
  @JsonProperty("ip")
  private String ip;

  /**
   **/
  public Ip ip(String ip) {
    this.ip = ip;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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
    return Objects.equals(ip, ip.ip);
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

