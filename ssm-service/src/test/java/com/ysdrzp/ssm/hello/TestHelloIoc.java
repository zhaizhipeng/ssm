package com.ysdrzp.ssm.hello;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 创建对象的三种方式
 */
public class TestHelloIoc {

    /**
     * 方式一：无参构造器方式
     */
    @Test
    public void testCreateObjectByConstrutor(){
        // 1、启动 spring 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2、从 spring 容器中取出数据
        HelloIoc IOC = (HelloIoc) context.getBean("helloIoc");
        // 3、通过对象调用方法        IOC.sayHello();
        // 利用配置文件 alias 别名属性创建对象
        HelloIoc IOC2 = (HelloIoc) context.getBean("helloIoc2");
        IOC2.sayHello();
    }

    /**
     * 方式二：静态工厂方法创建对象
     */
    @Test
    public void createObjectStaticFactory(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloIoc helloIoc = (HelloIoc) context.getBean("helloStaticFactory");
        helloIoc.sayHello();
    }

    /**
     * 方式三：实例工厂方法创建对象
     */
    @Test
    public void createObjectInstanceFactory(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloIoc staticFactory = (HelloIoc) context.getBean("instance");
        staticFactory.sayHello();
    }


}
