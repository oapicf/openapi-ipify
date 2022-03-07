/*
 * openapi-ipify
 *
 * OpenAPI client for ipify, a simple public IP address API
 *
 * The version of the OpenAPI document: 1.0.0-pre.0
 * Contact: blah@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using Polly;
using RestSharp;

namespace Org.OpenAPITools.Client
{
    /// <summary>
    /// Configuration class to set the polly retry policies to be applied to the requests.
    /// </summary>
    public static class RetryConfiguration
    {
        /// <summary>
        /// Retry policy
        /// </summary>
        public static Policy<IRestResponse> RetryPolicy { get; set; }

        /// <summary>
        /// Async retry policy
        /// </summary>
        public static AsyncPolicy<IRestResponse> AsyncRetryPolicy { get; set; }
    }
}