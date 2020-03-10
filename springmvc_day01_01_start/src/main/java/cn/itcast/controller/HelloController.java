package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 喻浩
 * @create 2019-08-20-12:22
 * 控制器类
 */
@Controller
@RequestMapping(path = "/user")
public class HelloController {
    
    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("hello springmvc");
        return "success";
    }

    /**
     * RequestMapping注解
     * @return
     */
    @RequestMapping(path = "/testRequestMapping",params = "username=heihei"
            ,headers = {"Accept"})
    public String testRequestMapping(){
        System.out.println("测试RequestMapping注解。。。");
        return "success";
    }
}
