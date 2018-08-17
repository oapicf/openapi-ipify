public class OASClient extends OAS.ApiClient {
    public OASClient() {
        basePath = 'https://api.ipify.org';
        calloutName = 'openapi_ipify';
    }
}
