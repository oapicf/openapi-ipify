#' openapi-ipify
#'
#' OpenAPI client for ipify, a simple public IP address API
#'
#' The version of the OpenAPI document: 5.3.1-pre.0
#' Contact: blah+oapicf@cliffano.com
#' Generated by: https://openapi-generator.tech
#'
#' @docType class
#' @title Default operations
#' @description DefaultApi
#' @format An \code{R6Class} generator object
#' @field api_client Handles the client-server communication.
#'
#' @section Methods:
#' \describe{
#' \strong{ GetIp } \emph{ Get your public IP address }
#'
#' \itemize{
#' \item \emph{ @param } format Enum < [json, jsonp] >
#' \item \emph{ @param } callback character
#'
#'
#' \item status code : 200 | Your public IP address
#'
#' \item return type : character
#' \item response headers :
#'
#' \tabular{ll}{
#' }
#' }
#'
#' }
#'
#'
#' @examples
#' \dontrun{
#' ####################  GetIp  ####################
#'
#' library(openapi)
#' var_format <- "format_example" # character | Response format (Optional)
#' var_callback <- "callback_example" # character | JSONP callback function name (Optional)
#'
#' #Get your public IP address
#' api_instance <- DefaultApi$new()
#'
#' # to save the result into a file, simply add the optional `data_file` parameter, e.g.
#' # result <- api_instance$GetIp(format = var_format, callback = var_callbackdata_file = "result.txt")
#' result <- api_instance$GetIp(format = var_format, callback = var_callback)
#' dput(result)
#'
#'
#' }
#' @importFrom R6 R6Class
#' @importFrom base64enc base64encode
#' @export
DefaultApi <- R6::R6Class(
  "DefaultApi",
  public = list(
    api_client = NULL,
    #' Initialize a new DefaultApi.
    #'
    #' @description
    #' Initialize a new DefaultApi.
    #'
    #' @param api_client An instance of API client.
    #' @export
    initialize = function(api_client) {
      if (!missing(api_client)) {
        self$api_client <- api_client
      } else {
        self$api_client <- ApiClient$new()
      }
    },
    #' Get your public IP address
    #'
    #' @description
    #' Get your public IP address
    #'
    #' @param format (optional) Response format
    #' @param callback (optional) JSONP callback function name
    #' @param data_file (optional) name of the data file to save the result
    #' @param ... Other optional arguments
    #' @return character
    #' @export
    GetIp = function(format = NULL, callback = NULL, data_file = NULL, ...) {
      local_var_response <- self$GetIpWithHttpInfo(format, callback, data_file = data_file, ...)
      if (local_var_response$status_code >= 200 && local_var_response$status_code <= 299) {
        local_var_response$content
      } else if (local_var_response$status_code >= 300 && local_var_response$status_code <= 399) {
        local_var_response
      } else if (local_var_response$status_code >= 400 && local_var_response$status_code <= 499) {
        local_var_response
      } else if (local_var_response$status_code >= 500 && local_var_response$status_code <= 599) {
        local_var_response
      }
    },
    #' Get your public IP address
    #'
    #' @description
    #' Get your public IP address
    #'
    #' @param format (optional) Response format
    #' @param callback (optional) JSONP callback function name
    #' @param data_file (optional) name of the data file to save the result
    #' @param ... Other optional arguments
    #' @return API response (character) with additional information such as HTTP status code, headers
    #' @export
    GetIpWithHttpInfo = function(format = NULL, callback = NULL, data_file = NULL, ...) {
      args <- list(...)
      query_params <- list()
      header_params <- c()
      form_params <- list()
      file_params <- list()
      local_var_body <- NULL
      oauth_scopes <- NULL
      is_oauth <- FALSE



      if (!(`format` %in% c("json", "jsonp"))) {
        stop("Invalid value for format when calling DefaultApi$GetIp. Must be [json, jsonp].")
      }
      query_params[["format"]] <- `format`

      query_params[["callback"]] <- `callback`

      local_var_url_path <- "/"

      # The Accept request HTTP header
      local_var_accepts <- list("text/plain", "application/javascript", "application/json")

      # The Content-Type representation header
      local_var_content_types <- list()

      local_var_resp <- self$api_client$CallApi(url = paste0(self$api_client$base_path, local_var_url_path),
                                 method = "GET",
                                 query_params = query_params,
                                 header_params = header_params,
                                 form_params = form_params,
                                 file_params = file_params,
                                 accepts = local_var_accepts,
                                 content_types = local_var_content_types,
                                 body = local_var_body,
                                 is_oauth = is_oauth,
                                 oauth_scopes = oauth_scopes,
                                 ...)

      if (local_var_resp$status_code >= 200 && local_var_resp$status_code <= 299) {
        # save response in a file
        if (!is.null(data_file)) {
          write(local_var_resp$response, data_file)
        }

        deserialized_resp_obj <- tryCatch(
          self$api_client$deserialize(local_var_resp$response_as_text(), "character", loadNamespace("openapi")),
          error = function(e) {
            stop("Failed to deserialize response")
          }
        )
        local_var_resp$content <- deserialized_resp_obj
        local_var_resp
      } else if (local_var_resp$status_code >= 300 && local_var_resp$status_code <= 399) {
        ApiResponse$new(paste("Server returned ", local_var_resp$status_code, " response status code."), local_var_resp)
      } else if (local_var_resp$status_code >= 400 && local_var_resp$status_code <= 499) {
        ApiResponse$new("API client error", local_var_resp)
      } else if (local_var_resp$status_code >= 500 && local_var_resp$status_code <= 599) {
        if (is.null(local_var_resp$response) || local_var_resp$response == "") {
          local_var_resp$response <- "API server error"
        }
        local_var_resp
      }
    }
  )
)
