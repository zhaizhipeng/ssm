package com.ysdrzp.aop.proxy.dynamic;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 目标对象
 */
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public EmployeeServiceImpl(){
        System.out.println("创建EmployeeServiceImpl对象");
    }

    public void save(Employee employee) {
        employeeDao.save(employee);
    }

    public void update(Employee employee) {
        employeeDao.update(employee);
    }

}
