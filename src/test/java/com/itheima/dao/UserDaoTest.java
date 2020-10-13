package com.itheima.dao;

import com.itheima.BaseTest;
import com.itheima.entity.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * @program: SpringMVC
 * @description:
 * @author: Xiaofei Wang
 * @created: 2020/10/12 21:00
 */


public class UserDaoTest extends BaseTest {

    @Autowired
    private UserDao userDao;

    @Before
    public void setUp(){
        System.out.println("test is start...");
    }

    @After
    public void tearDown(){
        System.out.println("test is done...");
    }

    @Test
    public void findAll() {
        List<User> userList = userDao.findAll();
        for(User user:userList){
            System.out.println(user);
        }
    }
}