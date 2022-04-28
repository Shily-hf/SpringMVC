package edu.shily.mvc.controller.controller;

import edu.shily.mvc.controller.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;

/**
 * @author Shily-zhang
 * @Description
 */
@Controller
public class ParamController {

    @RequestMapping("/testServletAPI")
    //形参位置的request表示当前请求
    public String testServletAPI(HttpServletRequest request){
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:" + username + ",password:" + password);

        return "success";
    }

    @RequestMapping("/testParam")
    public String testParam(
            @RequestParam(value = "user_name",required = false,defaultValue = "hehe") String username,//此时使用注解进行映射
            String password,
            String[] hobby,
            @RequestHeader(value = "sayHaha",required = true,defaultValue = "haha")String host,
            @CookieValue("JSESSIONID")String JSESSIONID){//String hobby -> String[] hobby
        //若请求参数中出现多个同名请求参数，可以在控制参数方法的形参位置设置字符串或字符串数组接收此请求参数
        //若使用字符串类型的形参，最终结果为请求参数的每一个值之间使用逗号隔开进行拼接
        System.out.println("username:" + username + ",password:" + password + ",hobby:" + Arrays.toString(hobby));
        System.out.println("host:" + host);
        System.out.println("JSESSIONID:" + JSESSIONID);

        return "success";
    }

    @RequestMapping("/testPOJO")
    public String testPOJO(User user){
        System.out.println(user);
        return "success";
    }
}
