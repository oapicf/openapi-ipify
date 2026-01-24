package org.openapitools.api.consumer;

import org.openapitools.model.GetIp200Response;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.DefaultService;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.18.0")

@RestController
@RequestMapping("/default")
public class DefaultServiceController {

    @DubboReference
    private DefaultService defaultService;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String getIp(
        @RequestParam(name = "format") String format,
        @RequestParam(name = "paramCallback") String paramCallback
    ) {
        return defaultService.getIp(format, paramCallback);
    }
}
