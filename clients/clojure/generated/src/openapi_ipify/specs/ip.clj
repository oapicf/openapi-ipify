(ns openapi-ipify.specs.ip
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ip-data
  {
   (ds/req :ip) string?
   })

(def ip-spec
  (ds/spec
    {:name ::ip
     :spec ip-data}))
