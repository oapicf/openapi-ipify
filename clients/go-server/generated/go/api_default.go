// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * openapi-ipify
 *
 * OpenAPI client for ipify, a simple public IP address API
 *
 * API version: 5.3.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 */

package openapi

import (
	"net/http"
	"strings"
)

// DefaultAPIController binds http requests to an api service and writes the service results to the http response
type DefaultAPIController struct {
	service DefaultAPIServicer
	errorHandler ErrorHandler
}

// DefaultAPIOption for how the controller is set up.
type DefaultAPIOption func(*DefaultAPIController)

// WithDefaultAPIErrorHandler inject ErrorHandler into controller
func WithDefaultAPIErrorHandler(h ErrorHandler) DefaultAPIOption {
	return func(c *DefaultAPIController) {
		c.errorHandler = h
	}
}

// NewDefaultAPIController creates a default api controller
func NewDefaultAPIController(s DefaultAPIServicer, opts ...DefaultAPIOption) *DefaultAPIController {
	controller := &DefaultAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the DefaultAPIController
func (c *DefaultAPIController) Routes() Routes {
	return Routes{
		"GetIp": Route{
			strings.ToUpper("Get"),
			"/",
			c.GetIp,
		},
	}
}

// GetIp - Get your public IP address
func (c *DefaultAPIController) GetIp(w http.ResponseWriter, r *http.Request) {
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	var formatParam string
	if query.Has("format") {
		param := query.Get("format")

		formatParam = param
	} else {
	}
	var callbackParam string
	if query.Has("callback") {
		param := query.Get("callback")

		callbackParam = param
	} else {
	}
	result, err := c.service.GetIp(r.Context(), formatParam, callbackParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}
