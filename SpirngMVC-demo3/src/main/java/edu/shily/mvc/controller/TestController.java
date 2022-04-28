package edu.shily.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Shily-zhang
 * @Description
 */
@Controller
public class TestController {

  /*  @RequestMapping("/")
    public String index(){

        return "index";
    }*/

    @RequestMapping("/test_view")
    public String testView(){
        return "test_view";
    }
}
