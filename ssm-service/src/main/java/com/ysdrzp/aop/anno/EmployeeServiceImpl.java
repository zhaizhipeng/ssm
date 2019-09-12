package com.ysdrzp.aop.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 目标对象
 */
@Service
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
