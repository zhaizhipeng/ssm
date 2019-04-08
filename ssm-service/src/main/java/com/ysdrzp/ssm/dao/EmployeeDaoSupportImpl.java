package com.ysdrzp.ssm.dao;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author zhipeng zhai
 * @date 2019/4/8 0008
 */
public class EmployeeDaoSupportImpl extends JdbcDaoSupport implements IEmployeeDao{

    public void save(Employee employee) {
       super.getJdbcTemplate().update("insert into employee(name,age) values(?,?)", employee.getName(), employee.getAge());
    }

    public void update(Employee employee) {
        super.getJdbcTemplate().update("update employee set age = ? where id = ?", employee.getAge(), employee.getId());
    }

    public void delete(Long id) {
        super.getJdbcTemplate().update("delete from employee where id = ?",id);
    }

    public Employee get(Long id) {
        List<Employee> list = super.getJdbcTemplate().query("select id,name,age from employee where id = ?", new Object[]{id}, new RowMapper<Employee>() {
            public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
                Employee employee = new Employee();
                employee.setId(resultSet.getLong("id"));
                employee.setName(resultSet.getString("name"));
                employee.setAge(resultSet.getInt("age"));
                return employee;
            }
        });
        if (list.size() == 1){
            return list.get(0);
        }
        return null;
    }

    public List<Employee> listAll() {
        return super.getJdbcTemplate().query("select id,name,age from employee", new Object[]{}, new RowMapper<Employee>() {
            public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
                Employee employee = new Employee();
                employee.setId(resultSet.getLong("id"));
                employee.setName(resultSet.getString("name"));
                employee.setAge(resultSet.getInt("age"));
                return employee;
            }
        });
    }
    
}
