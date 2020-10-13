package com.itheima.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
    @RequestMapping(value = "/testRestGet/{id}",method = RequestMethod.GET)
    public String restfulGet(@PathVariable Integer id){
        System.out.println("id: "+id);
        return "hello";
    }

    //符合Restful的put请求测试
    @RequestMapping(value = "/testRestPut",method = RequestMethod.PUT)
    public String restfulPut(){
        System.out.println("PUT方法测试成功");
        return "put";
    }

    //符合Restful的put请求测试
    @RequestMapping(value = "/testRestDelete/{id}",method = RequestMethod.DELETE)
    public String restfulDelete(@PathVariable String id){
        System.out.println("Delete方法测试成功,获取的参数值: "+id);
        return "delete";
    }

    @RequestMapping(value = "/testAjax_DELETE/{id}",method = RequestMethod.DELETE)
    public void ajaxDELETE(@PathVariable Integer id){
        System.out.println("请求删除的ID值为: "+"["+id+"]");
    }

    /**
     * springMVC获取客户端传递的数据的方式:
     * (1) 在处理请求的方法中,加入相对应的形参,保证形参参数名和传递的数据的参数名保持一致,就可以自动赋值RequestParam(value=xxx,required=true||false)
     * (2) value:当不满足映射关系时使用,指定value属性,指定映射关系
     * @param name 测试变量
     * @param country 测试变量
     * @param age 测试变量
     * @return 对应的jsp界面
     */
    @RequestMapping(value = "/getParameter",method = RequestMethod.POST)
    public String testGetParameter(@RequestParam(value = "username") String name, String country, @RequestParam(value = "age",defaultValue = "18")String age){
        System.out.println("username: "+name);
        System.out.println("country: "+country);
        System.out.println("age: "+age);
        return "success";
    }
}
