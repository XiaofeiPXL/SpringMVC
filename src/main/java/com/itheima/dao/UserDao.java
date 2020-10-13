package com.itheima.dao;

import com.itheima.entity.User;

import java.util.List;

/**
 * @program: SpringMVC
 * @description: 持久层接口
 * @author: Xiaofei Wang
 * @created: 2020/10/12 20:51
 */


public interface UserDao {
    /**
     * 查询所有用户
     * @return 用户对象
     */
    List<User> findAll();
}
