package com.ysdrzp.ssm.hello;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloIocTest {

    @Test
    public void testHelloIoc(){

        // 1、启动 spring 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2、从 spring 容器中取出数据
        HelloIoc helloIoc = (HelloIoc) context.getBean("helloIoc");
        // 3、通过对象调用方法
        helloIoc.sayHello();
    }

}
