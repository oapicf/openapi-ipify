using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Get your public IP address
/// </summary>

public class GetIpEndpoint : FastEndpoints.Endpoint<GetIpRequest, string>
{
    public override void Configure()
    {
        Get("/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("default");
        });

        Summary(s => {
            s.Summary = "Get your public IP address";
            s.RequestParam(r => r.Format, "Response format");
            s.RequestParam(r => r.Callback, "JSONP callback function name");
            s.Responses[200] = "Your public IP address";
        });
    }

    public override async Task HandleAsync(GetIpRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

