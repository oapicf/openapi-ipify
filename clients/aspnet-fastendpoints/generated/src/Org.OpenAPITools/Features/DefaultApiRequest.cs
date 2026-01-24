
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class GetIpRequest
{
    /// <summary>
    /// Response format
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("format")]
    public string? Format { get; set; }
    /// <summary>
    /// JSONP callback function name
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("callback")]
    public string? Callback { get; set; }
}


