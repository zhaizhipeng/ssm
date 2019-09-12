package com.ysdrzp.aop.anno;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 */
public class App {

    @Test
    void testSave() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop-anno-context.xml");
        IEmployeeService employeeServiceImpl = (IEmployeeService) applicationContext.getBean("employeeServiceImpl");
        employeeServiceImpl.save(new Employee());
    }

    @Test
    void testUpdate() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop-anno-context.xml");
        IEmployeeService employeeServiceImpl = (IEmployeeService) applicationContext.getBean("employeeServiceImpl");
        employeeServiceImpl.update(new Employee());
    }

}
