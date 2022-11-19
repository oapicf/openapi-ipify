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
        OASIp response;
        OASIp expectedResponse;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        js = JSON.serialize(OASIp.getExample());
        res.setHeader('Content-Type', 'application/javascript');
        res.setBody(js);
        expectedResponse = OASIp.getExample();
        response = (OASIp) api.getIp(params);
        System.assertEquals(expectedResponse, response);

        js = JSON.serialize(OASIp.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASIp.getExample();
        response = (OASIp) api.getIp(params);
        System.assertEquals(expectedResponse, response);

        js = JSON.serialize(OASIp.getExample());
        res.setHeader('Content-Type', 'text/plain');
        res.setBody(js);
        expectedResponse = OASIp.getExample();
        response = (OASIp) api.getIp(params);
        System.assertEquals(expectedResponse, response);
    }
}