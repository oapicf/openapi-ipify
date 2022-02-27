{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.DefaultSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getOpenapiIpifyHomeR" $
        it "returns 501 Not Implemented" $ do
            get OpenapiIpifyHomeR
            statusIs 501
