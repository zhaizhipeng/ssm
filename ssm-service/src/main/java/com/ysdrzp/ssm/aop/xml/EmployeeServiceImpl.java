package com.ysdrzp.ssm.aop.xml;

/**
 * 目标对象
 */
public class EmployeeServiceImpl implements IEmployeeService {

    private EmployeeDao employeeDao;

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void save(Employee employee) {
        employeeDao.save(employee);
    }

    public void update(Employee employee) {
        employeeDao.update(employee);
    }

}
