/*
 * openapi-ipify
 * OpenAPI client for ipify, a simple public IP address API
 *
 * The version of the OpenAPI document: 5.3.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.oapicf.openapiipify.auth;

import com.github.oapicf.openapiipify.ApiException;
import com.github.oapicf.openapiipify.Pair;

import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-09T23:54:55.294331085Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class HttpBearerAuth implements Authentication {
  private final String scheme;
  private Supplier<String> tokenSupplier;

  public HttpBearerAuth(String scheme) {
    this.scheme = scheme;
  }

  /**
   * Gets the token, which together with the scheme, will be sent as the value of the Authorization header.
   *
   * @return The bearer token
   */
  public String getBearerToken() {
    return tokenSupplier.get();
  }

  /**
   * Sets the token, which together with the scheme, will be sent as the value of the Authorization header.
   *
   * @param bearerToken The bearer token to send in the Authorization header
   */
  public void setBearerToken(String bearerToken) {
    this.tokenSupplier = () -> bearerToken;
  }

  /**
   * Sets the supplier of tokens, which together with the scheme, will be sent as the value of the Authorization header.
   *
   * @param tokenSupplier The supplier of bearer tokens to send in the Authorization header
   */
  public void setBearerToken(Supplier<String> tokenSupplier) {
    this.tokenSupplier = tokenSupplier;
  }

  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams, Map<String, String> cookieParams,
                            String payload, String method, URI uri) throws ApiException {
    String bearerToken = Optional.ofNullable(tokenSupplier).map(Supplier::get).orElse(null);
    if (bearerToken == null) {
      return;
    }

    headerParams.put("Authorization", (scheme != null ? upperCaseBearer(scheme) + " " : "") + bearerToken);
  }

  private static String upperCaseBearer(String scheme) {
    return ("bearer".equalsIgnoreCase(scheme)) ? "Bearer" : scheme;
  }
}
