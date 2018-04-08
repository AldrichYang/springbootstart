package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

/**
 * Created by yh on 2018/4/8.
 */
@Controller
public class ParamConverterController {
    @RequestMapping(path = "/anyConverter", method = RequestMethod.POST, produces = {APPLICATION_XML_VALUE, APPLICATION_JSON_VALUE})
    @ResponseBody
    Map anyConverter(@RequestBody Map requestParams) {
        return requestParams;
    }

}
