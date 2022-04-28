package edu.shily.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Shily-zhang
 * @Description
 */
@Controller
public class JspController {

    @RequestMapping("/success")
    public String success(){

        return "success";
    }
}
