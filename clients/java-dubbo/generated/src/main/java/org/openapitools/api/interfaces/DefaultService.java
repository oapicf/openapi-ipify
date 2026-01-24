package org.openapitools.api.interfaces;

import org.openapitools.model.GetIp200Response;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.18.0")

public interface DefaultService {

    /**
     * Get your public IP address
     * 
     *
     * @param format Response format (optional)
     * @param paramCallback JSONP callback function name (optional)
     * @return String
     */
    String getIp(
        String format,
        String paramCallback
    );
}
