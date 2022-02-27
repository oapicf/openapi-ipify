import com.google.inject.AbstractModule;

import controllers.*;
import openapitools.SecurityAPIUtils;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(DefaultApiControllerImpInterface.class).to(DefaultApiControllerImp.class);
        bind(SecurityAPIUtils.class);
    }
}