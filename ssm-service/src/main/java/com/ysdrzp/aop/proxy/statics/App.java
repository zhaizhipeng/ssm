package com.ysdrzp.aop.proxy.statics;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 */
public class App {

    /**
     * 静态代理优缺点
     * 优点：可以在不修改目标对象的前提下扩展目标对象的功能。
     * 缺点：1、冗余，由于代理对象要实现与目标对象一致的接口，会产生过多的代理类。2、不易维护，一旦接口增加方法，目标对象与代理对象都要进行修改。
     */

    @Test
    public void testSave(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop-proxy-statics-context.xml");
        EmployeeServiceImplProxy employeeService = (EmployeeServiceImplProxy) applicationContext.getBean("employeeServiceImplProxy");
        Employee employee = new Employee("超",10000);
        employeeService.save(employee);
    }

    @Test
    public void testUpdate(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop-proxy-statics-context.xml");
        EmployeeServiceImplProxy employeeService = (EmployeeServiceImplProxy) applicationContext.getBean("employeeServiceImplProxy");
        Employee employee = new Employee("生",20000);
        employeeService.update(employee);
    }

}
