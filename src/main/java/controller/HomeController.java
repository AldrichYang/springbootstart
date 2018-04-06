package controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@EnableAutoConfiguration
public class HomeController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping(path = "/anyConverter", method = RequestMethod.POST)
    @ResponseBody
    Map anyConverter(@RequestBody Map requestParams) {
        return requestParams;
    }


    @RequestMapping(path = "/anyContent", method = RequestMethod.POST)
    String anyContent(@RequestBody Map requestParams) {
        System.out.println(requestParams.toString());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("rtn", requestParams);
        return "any";
    }


}
