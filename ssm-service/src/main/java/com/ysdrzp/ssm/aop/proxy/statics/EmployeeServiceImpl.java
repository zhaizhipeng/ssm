package com.ysdrzp.ssm.aop.proxy.statics;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 目标对象
 */
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public void save(Employee employee) {
        employeeDao.save(employee);
    }

    public void update(Employee employee) {
        employeeDao.update(employee);
    }

}
