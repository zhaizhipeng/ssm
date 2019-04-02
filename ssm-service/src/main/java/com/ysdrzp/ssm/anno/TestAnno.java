package com.ysdrzp.ssm.anno;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnno {

    @Test
    public void testIocAnno(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("anno-context.xml");
        SomeBean someBean = (SomeBean) applicationContext.getBean("someBean");
        System.out.println(someBean);
    }

    @Test
    public void testDiAnno(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("anno-context.xml");
        SomeBean someBean = (SomeBean) applicationContext.getBean("someBean");
        System.out.println(someBean.getOtherBean());
        System.out.println(someBean.getOtherBean2());
    }
}
