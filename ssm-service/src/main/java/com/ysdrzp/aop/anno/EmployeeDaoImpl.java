package com.ysdrzp.aop.anno;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    public void save(Employee employee) {
        System.out.println("保存");
    }

    public void update(Employee employee) {
        System.out.println("更新");
    }
}
