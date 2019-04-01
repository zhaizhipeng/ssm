package com.ysdrzp.ssm.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {

    /**
     * setter方式注入
     */
    @Test
    public void testSetter(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("di-context.xml");
        Family family = (Family) applicationContext.getBean("family");
        System.out.println(family);
    }
}
