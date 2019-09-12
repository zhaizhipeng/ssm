package com.ysdrzp.aop.proxy.dynamic;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 */
public class App {

    @Test
    void testSave() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop-proxy-dynamic-context.xml");
        TransactionManagerAdvice transactionManagerAdvice = (TransactionManagerAdvice) applicationContext.getBean("transactionManagerAdvice");
        EmployeeServiceImpl employeeServiceImpl = (EmployeeServiceImpl) applicationContext.getBean("employeeServiceImpl");
        transactionManagerAdvice.setObject(employeeServiceImpl);
        IEmployeeService proxy = transactionManagerAdvice.getProxyObject();
        proxy.save(new Employee());
    }

    @Test
    void testUpdate() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop-proxy-dynamic-context.xml");
        TransactionManagerAdvice transactionManagerAdvice = (TransactionManagerAdvice) applicationContext.getBean("transactionManagerAdvice");
        EmployeeServiceImpl employeeServiceImpl = (EmployeeServiceImpl) applicationContext.getBean("employeeServiceImpl");
        transactionManagerAdvice.setObject(employeeServiceImpl);
        IEmployeeService proxy = transactionManagerAdvice.getProxyObject();
        proxy.update(new Employee());
    }

}
