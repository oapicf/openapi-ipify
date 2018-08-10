package controllers;


import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface DefaultApiControllerImpInterface {
    Object getIp(String format, String paramCallback) throws Exception;

}
