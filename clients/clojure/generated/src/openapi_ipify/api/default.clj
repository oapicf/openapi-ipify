(ns openapi-ipify.api.default
  (:require [openapi-ipify.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]
            [openapi-ipify.specs.ip :refer :all]
            )
  (:import (java.io File)))


(defn-spec get-ip-with-http-info any?
  "Get your public IP address"
  ([] (get-ip-with-http-info nil))
  ([{:keys [format callback]} (s/map-of keyword? any?)]
   (call-api "/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"format" format "callback" callback }
              :form-params   {}
              :content-types []
              :accepts       ["*/*"]
              :auth-names    []})))

(defn-spec get-ip one-of&lt;ip,string&gt;-spec
  "Get your public IP address"
  ([] (get-ip nil))
  ([optional-params any?]
   (let [res (:data (get-ip-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode one-of&lt;ip,string&gt;-spec res st/string-transformer)
        res))))


