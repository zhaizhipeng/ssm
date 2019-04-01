package com.ysdrzp.ssm.di;

import com.ysdrzp.ssm.di.constructor.SomeBean;
import com.ysdrzp.ssm.di.setter.Family;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {

    /**
     * 方式一：setter方式注入
     */
    @Test
    public void testSetter(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("di-context.xml");
        Family family = (Family) applicationContext.getBean("family");
        System.out.println(family);
    }

    /**
     * 方式二：构造器方式注入
     */
    @Test
    public void testConstructor(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("di-context.xml");
        SomeBean someBean = (SomeBean) applicationContext.getBean("someBean");
        System.out.println(someBean);
    }
}
