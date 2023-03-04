#' Create a new Ip
#'
#' @description
#' Ip Class
#'
#' @docType class
#' @title Ip
#' @description Ip Class
#' @format An \code{R6Class} generator object
#' @field ip  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Ip <- R6::R6Class(
  "Ip",
  public = list(
    `ip` = NULL,
    #' Initialize a new Ip class.
    #'
    #' @description
    #' Initialize a new Ip class.
    #'
    #' @param ip ip
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`ip`, ...) {
      if (!missing(`ip`)) {
        if (!(is.character(`ip`) && length(`ip`) == 1)) {
          stop(paste("Error! Invalid data for `ip`. Must be a string:", `ip`))
        }
        self$`ip` <- `ip`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Ip in JSON format
    #' @export
    toJSON = function() {
      IpObject <- list()
      if (!is.null(self$`ip`)) {
        IpObject[["ip"]] <-
          self$`ip`
      }
      IpObject
    },
    #' Deserialize JSON string into an instance of Ip
    #'
    #' @description
    #' Deserialize JSON string into an instance of Ip
    #'
    #' @param input_json the JSON input
    #' @return the instance of Ip
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ip`)) {
        self$`ip` <- this_object$`ip`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Ip in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`ip`)) {
          sprintf(
          '"ip":
            "%s"
                    ',
          self$`ip`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of Ip
    #'
    #' @description
    #' Deserialize JSON string into an instance of Ip
    #'
    #' @param input_json the JSON input
    #' @return the instance of Ip
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ip` <- this_object$`ip`
      self
    },
    #' Validate JSON input with respect to Ip
    #'
    #' @description
    #' Validate JSON input with respect to Ip and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `ip`
      if (!is.null(input_json$`ip`)) {
        if (!(is.character(input_json$`ip`) && length(input_json$`ip`) == 1)) {
          stop(paste("Error! Invalid data for `ip`. Must be a string:", input_json$`ip`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Ip: the required field `ip` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of Ip
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      # check if the required `ip` is null
      if (is.null(self$`ip`)) {
        return(FALSE)
      }

      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `ip` is null
      if (is.null(self$`ip`)) {
        invalid_fields["ip"] <- "Non-nullable required field `ip` cannot be null."
      }

      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# Ip$unlock()
#
## Below is an example to define the print function
# Ip$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Ip$lock()

