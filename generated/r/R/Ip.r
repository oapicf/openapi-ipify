# ipify
#
# OpenAPI client for ipify, a simple public IP address API
#
# OpenAPI spec version: 0.9.0
# 
# Generated by: https://openapi-generator.tech


#' Ip Class
#'
#' @field ip 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Ip <- R6::R6Class(
  'Ip',
  public = list(
    `ip` = NULL,
    initialize = function(`ip`){
      if (!missing(`ip`)) {
        stopifnot(is.character(`ip`), length(`ip`) == 1)
        self$`ip` <- `ip`
      }
    },
    toJSON = function() {
      IpObject <- list()
      if (!is.null(self$`ip`)) {
        IpObject[['ip']] <- self$`ip`
      }

      IpObject
    },
    fromJSON = function(IpJson) {
      IpObject <- jsonlite::fromJSON(IpJson)
      if (!is.null(IpObject$`ip`)) {
        self$`ip` <- IpObject$`ip`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "ip": %s
        }',
        self$`ip`
      )
    },
    fromJSONString = function(IpJson) {
      IpObject <- jsonlite::fromJSON(IpJson)
      self$`ip` <- IpObject$`ip`
    }
  )
)