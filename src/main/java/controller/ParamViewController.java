package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

/**
 * Created by yh on 2018/4/8.
 */
@Controller
public class ParamViewController {

    @RequestMapping(path = "/anyContent", method = RequestMethod.POST, produces = {APPLICATION_XML_VALUE, APPLICATION_JSON_VALUE})
    String anyContent(Model model, @RequestBody Map requestParams) {
        model.addAttribute("requestParams", requestParams);
        return "anyContent";
    }
}
