@isTest
private class OASDefaultApiTest {
    /**
     * Get your public IP address
     *
     * 
     */
    @isTest
    private static void getIpTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'format' => json,
            'paramCallback' => 'null'
        };

        OASClient client;
        OASDefaultApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.getIp(params);
    }
}