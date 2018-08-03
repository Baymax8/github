package com.test.test;

import com.test.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fhd on 2018/7/23.
 */
public class MyTest {
    @Autowired
    UserMapper userMapper;
    public static void main(String[] args) {
        //1、创建SpringIOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2、从容器中获取mapper
        UserMapper bean = ioc.getBean(UserMapper.class);
        System.out.println(bean);
    }
}
