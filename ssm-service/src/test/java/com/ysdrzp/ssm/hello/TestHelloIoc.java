package com.ysdrzp.ssm.hello;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

    /**
     * 单例模式创建对象:在单例模式下，默认情况，未开启懒加载，启动容器，便会创建对象
     */
    @Test
    public void test_scope_single_CreateObject(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloIoc hello1 = (HelloIoc) context.getBean("helloIoc");
        HelloIoc hello2 = (HelloIoc) context.getBean("helloIoc");
        System.out.println(hello1 == hello2);
    }

    /**
     * 多例模式创建对象:在多例模式下，无论是否开启懒加载模式，启动容器都不会创建对象，获得 bean 的时候才会创建对象。
     */
    @Test
    public void test_scope_prototype_CreateObject(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloIoc hello1 = (HelloIoc) context.getBean("helloIoc");
        HelloIoc hello2 = (HelloIoc) context.getBean("helloIoc");
        System.out.println(hello1 == hello2);
    }

}
