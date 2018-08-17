(ns openapi-ipify.api.default
  (:require [openapi-ipify.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-ip-with-http-info
  "Get your public IP address"
  ([] (get-ip-with-http-info nil))
  ([{:keys [format callback ]}]
   (call-api "/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"format" format "callback" callback }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    []})))

(defn get-ip
  "Get your public IP address"
  ([] (get-ip nil))
  ([optional-params]
   (:data (get-ip-with-http-info optional-params))))

