(ns openapi-ipify.specs.get-ip-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def get-ip-200-response-data
  {
   (ds/opt :ip) string?
   })

(def get-ip-200-response-spec
  (ds/spec
    {:name ::get-ip-200-response
     :spec get-ip-200-response-data}))
