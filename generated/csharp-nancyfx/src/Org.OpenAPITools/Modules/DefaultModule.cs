using System;
using Nancy;
using Nancy.ModelBinding;
using System.Collections.Generic;
using Sharpility.Base;
using Org.OpenAPITools..Models;
using Org.OpenAPITools..Utils;
using NodaTime;

namespace Org.OpenAPITools..Modules
{ 
    /// <summary>
    /// Response format
    /// </summary>
    public enum GetIpFormatEnum
    {
        json = 1, 
        jsonp = 2
    };


    /// <summary>
    /// Module processing requests of Default domain.
    /// </summary>
    public sealed class DefaultModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public DefaultModule(DefaultService service) : base("/")
        { 
            Get["/"] = parameters =>
            {
                var format = Parameters.ValueOf<GetIpFormatEnum?>(parameters, Context.Request, "format", ParameterType.Query);
                var callback = Parameters.ValueOf<string>(parameters, Context.Request, "callback", ParameterType.Query);
                return service.GetIp(Context, format, callback);
            };
        }
    }

    /// <summary>
    /// Service handling Default requests.
    /// </summary>
    public interface DefaultService
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="format">Response format (optional)</param>
        /// <param name="callback">JSONP callback function name (optional)</param>
        /// <returns>Object</returns>
        Object GetIp(NancyContext context, GetIpFormatEnum? format, string callback);
    }

    /// <summary>
    /// Abstraction of DefaultService.
    /// </summary>
    public abstract class AbstractDefaultService: DefaultService
    {
        public virtual Object GetIp(NancyContext context, GetIpFormatEnum? format, string callback)
        {
            return GetIp(format, callback);
        }

        protected abstract Object GetIp(GetIpFormatEnum? format, string callback);
    }

}
