package org.openapitools.client.model {


    [XmlRootNode(name="Ip")]
    public class Ip {
                [XmlElement(name="ip")]
        public var ip: String = null;

    public function toString(): String {
        var str: String = "Ip: ";
        str += " (ip: " + ip + ")";
        return str;
    }

}

}
