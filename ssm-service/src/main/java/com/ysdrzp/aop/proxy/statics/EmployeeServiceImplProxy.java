package com.ysdrzp.aop.proxy.statics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * 代理对象
 */
public class EmployeeServiceImplProxy implements IEmployeeService {

    @Autowired
    private TransactionManager transactionManager;

    @Autowired
    @Qualifier("employeeServiceImpl")
    private IEmployeeService employeeService;

    public void save(Employee employee) {
        transactionManager.begin();
        try {
            employeeService.save(employee);
            transactionManager.commit();
        }catch (Exception e){
            e.getStackTrace();
            transactionManager.rollBack();
        }
    }

    public void update(Employee employee) {
        transactionManager.begin();
        try {
            employeeService.update(employee);
            transactionManager.commit();
        }catch (Exception e){
            e.getStackTrace();
            transactionManager.rollBack();
        }
    }
}
