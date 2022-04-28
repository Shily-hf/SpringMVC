package edu.shily.mvc.controller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Shily-zhang
 * @Description
 */

@Controller
public class TestController {

    @RequestMapping("/")
    public String index(){

        return "index";
    }

    @RequestMapping("/param")
    public String param(){

        return "test_param";
    }
}
