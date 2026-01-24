@isTest
private class OASGetIp200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetIp200Response getIp200Response1 = OASGetIp200Response.getExample();
        OASGetIp200Response getIp200Response2 = getIp200Response1;
        OASGetIp200Response getIp200Response3 = new OASGetIp200Response();
        OASGetIp200Response getIp200Response4 = getIp200Response3;

        System.assert(getIp200Response1.equals(getIp200Response2));
        System.assert(getIp200Response2.equals(getIp200Response1));
        System.assert(getIp200Response1.equals(getIp200Response1));
        System.assert(getIp200Response3.equals(getIp200Response4));
        System.assert(getIp200Response4.equals(getIp200Response3));
        System.assert(getIp200Response3.equals(getIp200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetIp200Response getIp200Response1 = OASGetIp200Response.getExample();
        OASGetIp200Response getIp200Response2 = OASGetIp200Response.getExample();
        OASGetIp200Response getIp200Response3 = new OASGetIp200Response();
        OASGetIp200Response getIp200Response4 = new OASGetIp200Response();

        System.assert(getIp200Response1.equals(getIp200Response2));
        System.assert(getIp200Response2.equals(getIp200Response1));
        System.assert(getIp200Response3.equals(getIp200Response4));
        System.assert(getIp200Response4.equals(getIp200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetIp200Response getIp200Response1 = OASGetIp200Response.getExample();
        OASGetIp200Response getIp200Response2 = new OASGetIp200Response();

        System.assertEquals(false, getIp200Response1.equals('foo'));
        System.assertEquals(false, getIp200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetIp200Response getIp200Response1 = OASGetIp200Response.getExample();
        OASGetIp200Response getIp200Response2 = new OASGetIp200Response();
        OASGetIp200Response getIp200Response3;

        System.assertEquals(false, getIp200Response1.equals(getIp200Response3));
        System.assertEquals(false, getIp200Response2.equals(getIp200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetIp200Response getIp200Response1 = OASGetIp200Response.getExample();
        OASGetIp200Response getIp200Response2 = new OASGetIp200Response();

        System.assertEquals(getIp200Response1.hashCode(), getIp200Response1.hashCode());
        System.assertEquals(getIp200Response2.hashCode(), getIp200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetIp200Response getIp200Response1 = OASGetIp200Response.getExample();
        OASGetIp200Response getIp200Response2 = OASGetIp200Response.getExample();
        OASGetIp200Response getIp200Response3 = new OASGetIp200Response();
        OASGetIp200Response getIp200Response4 = new OASGetIp200Response();

        System.assert(getIp200Response1.equals(getIp200Response2));
        System.assert(getIp200Response3.equals(getIp200Response4));
        System.assertEquals(getIp200Response1.hashCode(), getIp200Response2.hashCode());
        System.assertEquals(getIp200Response3.hashCode(), getIp200Response4.hashCode());
    }
}
