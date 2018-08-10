package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class IpList implements ListWrapper {
        // This declaration below of _Ip_obj_class is to force flash compiler to include this class
        private var _ip_obj_class: org.openapitools.client.model.Ip = null;
        [XmlElements(name="ip", type="org.openapitools.client.model.Ip")]
        public var ip: Array = new Array();

        public function getList(): Array{
            return ip;
        }

}

}
