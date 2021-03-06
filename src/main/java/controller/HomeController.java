package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("/")
public class HomeController {

    @RequestMapping(path = "home", method = RequestMethod.GET)
    @ResponseBody
    String home() {
        return "Hello World!";
    }

}
