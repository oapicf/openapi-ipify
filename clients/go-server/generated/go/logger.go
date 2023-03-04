/*
 * openapi-ipify
 *
 * OpenAPI client for ipify, a simple public IP address API
 *
 * API version: 3.3.1-pre.0
 * Contact: blah@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"log"
	"net/http"
	"time"
)

func Logger(inner http.Handler, name string) http.Handler {
	return http.HandlerFunc(func(w http.ResponseWriter, r *http.Request) {
		start := time.Now()

		inner.ServeHTTP(w, r)

		log.Printf(
			"%s %s %s %s",
			r.Method,
			r.RequestURI,
			name,
			time.Since(start),
		)
	})
}
