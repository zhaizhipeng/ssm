package com.ysdrzp.ssm.aop.xml;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 */
public class App {

    @Test
    void testSave() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop-xml-context.xml");
        IEmployeeService employeeService = (IEmployeeService) applicationContext.getBean("employeeServiceImpl");
        employeeService.save(new Employee());
    }

    @Test
    void testUpdate() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop-xml-context.xml");
        IEmployeeService employeeService = (IEmployeeService) applicationContext.getBean("employeeServiceImpl");
        employeeService.update(new Employee());
    }

}
