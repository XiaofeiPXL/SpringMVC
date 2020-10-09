package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @program: SpringMVC
 * @description: controller测试类
 * @author: Xiaofei Wang
 * @created: 2020/10/08 18:40
 */

@Controller
@RequestMapping(value = "/test",method = RequestMethod.GET)
public class testController {

    @RequestMapping(value = "/sayHello")
    public String sayHello(){
        System.out.println("hello world!");
        return "hello";
    }

    //PathVariable注解可以解析浏览器路径中的变量值,通过占位符赋值给形参
    @RequestMapping(value = "/sayByeBye/{username}/{password}")
    public String sayByeBye(@PathVariable String username, @PathVariable String password){
        System.out.println("username: "+ username +" "+"password "+password);
        return "hello";
    }

    //符合Restful的get请求测试
    @RequestMapping(value = "/testRestGet/{id}")
    public String restfulGet(@PathVariable Integer id){
        System.out.println("id: "+id);
        return "hello";
    }
}
