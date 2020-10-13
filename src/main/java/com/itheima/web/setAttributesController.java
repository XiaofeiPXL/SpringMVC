package com.itheima.web;

import com.itheima.dao.UserDao;
import com.itheima.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;


/**
 * @program: SpringMVC
 * @description: 测试向作用域中赋值
 * (1)可以使用POJO获取客户端数据,要求实体类对象中的属性名一定要和表单元素的name属性值一致,且支持级联关系
 * (2)可以通过设置形参的方式,获取servletAPI
 * (3)所有方式都会把model和view中的数据存放到modelAndView对象中
 * @author: Xiaofei Wang
 * @created: 2020/10/10 15:17
 */

@Controller
public class setAttributesController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("/setAttributesOne")
    private String setParameterMethodOne(User user){
        System.out.println(user.getAddress());
        return "success";
    }

    @RequestMapping("/setAttributesSecond")
    private String setParameterMethodSecond(User user, HttpServletRequest request, HttpServletResponse response){
        String age = request.getParameter("age");
        request.setAttribute("username", user.getUsername());
        System.out.println(user.getAddress());
        return "success";
    }

    @RequestMapping("/setAttributesThird")
    private ModelAndView setParameterMethodThird(User user, HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();
        //设置属性和属性值,key-value键值对
        modelAndView.addObject("username",user.getUsername());
        //设置视图名称
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/setAttributesFourth")
    private String setParameterMethodFourth(Map<String,Object> modelMap,User user){
        //和上面一种方法一样
        modelMap.put("username",user.getUsername());
        return "success";
    }

    @RequestMapping("/testJson")
    @ResponseBody
    private List<User> testJson(){
        List<User> userList = userDao.findAll();
        for(User user:userList){
            System.out.println(user);
        }
        return userList;
    }
}
