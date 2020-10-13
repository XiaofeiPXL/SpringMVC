package com.itheima;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: SpringMVC
 * @description: Junit套件支持Spring配置
 * @author: Xiaofei Wang
 * @created: 2020/10/12 21:12
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml"})
public class BaseTest {
}
