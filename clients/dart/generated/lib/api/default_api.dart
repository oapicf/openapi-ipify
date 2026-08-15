//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class DefaultApi {
  DefaultApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Get your public IP address
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] format:
  ///   Response format
  ///
  /// * [String] callback:
  ///   JSONP callback function name
  Future<Response> getIpWithHttpInfo({ String? format, String? callback, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (format != null) {
      queryParams.addAll(_queryParams('', 'format', format));
    }
    if (callback != null) {
      queryParams.addAll(_queryParams('', 'callback', callback));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
    );
  }

  /// Get your public IP address
  ///
  /// Parameters:
  ///
  /// * [String] format:
  ///   Response format
  ///
  /// * [String] callback:
  ///   JSONP callback function name
  Future<String?> getIp({ String? format, String? callback, Future<void>? abortTrigger, }) async {
    final response = await getIpWithHttpInfo(format: format, callback: callback, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'String',) as String;
    
    }
    return null;
  }
}
