package edu.shily.mvc.controller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Shily-zhang
 * @Description
 */
@Controller
//@RequestMapping("/hello")
public class RequestMappingController {

    @RequestMapping(
            value = {"/testRequestMapping","/test"},//只要满足其一即可
            method = {RequestMethod.GET,RequestMethod.POST}
    )
    public String success(){

        return "success";
    }

    @GetMapping("/testGetMapping")
    public String testGetMapping(){

        return "success";
    }

    @PostMapping("/testPostMapping")
    public String testPostMapping(){

        return "success";
    }

    @RequestMapping(value = "/testPut",method = RequestMethod.PUT)
    public String testPut(){

        return "success";
    }

    @RequestMapping(
            value = "/testParamsAndHeaders",
            params = {"username"},//params = {"!username"}or params = {"username","password != 123456"}
            headers = {"Host=localhost:8080"}
    )
    public String testParams(){

        return "success";
    }

//    @RequestMapping("/a?a/testAnt")//只能有一个字符，且不能为?和/
//    @RequestMapping("/a*a/testAnt")//0个或多个字符，且不能为?和/
    @RequestMapping("/**/testAnt")//0层或多层目录，不能为?
    public String testAnt(){

        return "success";
    }

    @RequestMapping("/testPath/{id}/{username}")
    public String testPath(@PathVariable("id") Integer id,@PathVariable("username") String username){
        System.out.println("id:" + id + ",username:" + username);

        return "success";
    }
}
