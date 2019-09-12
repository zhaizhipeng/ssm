package com.ysdrzp.dao;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhipeng zhai
 * @date 2019/4/8 0008
 */
public class App {

    @Test
    public void testSave(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("dao-context.xml");
        IEmployeeDao employeeDao = (IEmployeeDao) applicationContext.getBean("employeeDaoImpl");
        Employee employee = new Employee();
        employee.setName("test");
        employee.setAge(20);
        employeeDao.save(employee);
    }

    @Test
    public void testUpdate(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("dao-context.xml");
        IEmployeeDao employeeDao = (IEmployeeDao) applicationContext.getBean("employeeDaoImpl");
        Employee employee = new Employee();
        employee.setName("test");
        employee.setAge(25);
        employee.setId(16);
        employeeDao.update(employee);
    }

    @Test
    public void testDelete(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("dao-context.xml");
        IEmployeeDao employeeDao = (IEmployeeDao) applicationContext.getBean("employeeDaoImpl");
        employeeDao.delete(16l);
    }

    @Test
    public void testGet(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("dao-context.xml");
        IEmployeeDao employeeDao = (IEmployeeDao) applicationContext.getBean("employeeDaoImpl");
        System.out.println(employeeDao.get(17l));
    }

    @Test
    public void testListAll(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("dao-context.xml");
        IEmployeeDao employeeDao = (IEmployeeDao) applicationContext.getBean("employeeDaoSupportImpl");
        System.out.println(employeeDao.listAll());
    }

}
