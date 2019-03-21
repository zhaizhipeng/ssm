package com.ysdrzp.ssm.hello;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * 初识Ioc，获取 bean 的三种方式
 */
public class HelloIocTest {

    @Test
    public void testHelloIoc(){

        // 1、加载配置文件
        Resource resource = new ClassPathResource("applicationContext.xml");
        // 2、创建Sring容器
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        // getBean 的三种方式
        // 方式一：根据 bean 的名字获取 bean 对象，这种方式不太安全
        HelloIoc helloIoc = (HelloIoc) beanFactory.getBean("helloIoc");
        helloIoc.sayHello();
        // 方式二：按照类型获取 bean 对象，这种方式要求Spring中只配置一种这种类型 bean 的实例
        HelloIoc helloIoc1 = beanFactory.getBean(HelloIoc.class);
        helloIoc.sayHello();
        // 方式三：按照名字和类型获取 bean 对象
        HelloIoc helloIoc2 = beanFactory.getBean("helloIoc",HelloIoc.class);
        helloIoc2.sayHello();
    }

}
