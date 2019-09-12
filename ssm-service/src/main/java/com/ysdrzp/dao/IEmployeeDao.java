package com.ysdrzp.dao;

import java.util.List;

/**
 * @author zhipeng zhai
 * @date 2019/4/8 0008
 */
public interface IEmployeeDao {

    void save(Employee employee);

    void update(Employee employee);

    void delete(Long id);

    Employee get(Long id);

    List<Employee> listAll();
}
