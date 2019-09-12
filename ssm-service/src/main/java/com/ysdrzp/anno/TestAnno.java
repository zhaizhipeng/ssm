package com.ysdrzp.anno;

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
        System.out.println(someBean.getPort());
    }

    /**
     * 初始化与销毁注解
     */
    @Test
    public void testAnno(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("anno-context.xml");
        SomeBean someBean = (SomeBean) applicationContext.getBean("someBean");
        someBean.work();
    }


}
