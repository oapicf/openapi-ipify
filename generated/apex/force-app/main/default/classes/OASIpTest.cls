@isTest
private class OASIpTest {
    @isTest
    private static void equalsSameInstance() {
        OASIp ip1 = OASIp.getExample();
        OASIp ip2 = ip1;
        OASIp ip3 = new OASIp();
        OASIp ip4 = ip3;

        System.assert(ip1.equals(ip2));
        System.assert(ip2.equals(ip1));
        System.assert(ip1.equals(ip1));
        System.assert(ip3.equals(ip4));
        System.assert(ip4.equals(ip3));
        System.assert(ip3.equals(ip3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASIp ip1 = OASIp.getExample();
        OASIp ip2 = OASIp.getExample();
        OASIp ip3 = new OASIp();
        OASIp ip4 = new OASIp();

        System.assert(ip1.equals(ip2));
        System.assert(ip2.equals(ip1));
        System.assert(ip3.equals(ip4));
        System.assert(ip4.equals(ip3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASIp ip1 = OASIp.getExample();
        OASIp ip2 = new OASIp();

        System.assertEquals(false, ip1.equals('foo'));
        System.assertEquals(false, ip2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASIp ip1 = OASIp.getExample();
        OASIp ip2 = new OASIp();
        OASIp ip3;

        System.assertEquals(false, ip1.equals(ip3));
        System.assertEquals(false, ip2.equals(ip3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASIp ip1 = OASIp.getExample();
        OASIp ip2 = new OASIp();

        System.assertEquals(ip1.hashCode(), ip1.hashCode());
        System.assertEquals(ip2.hashCode(), ip2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASIp ip1 = OASIp.getExample();
        OASIp ip2 = OASIp.getExample();
        OASIp ip3 = new OASIp();
        OASIp ip4 = new OASIp();

        System.assert(ip1.equals(ip2));
        System.assert(ip3.equals(ip4));
        System.assertEquals(ip1.hashCode(), ip2.hashCode());
        System.assertEquals(ip3.hashCode(), ip4.hashCode());
    }
}
