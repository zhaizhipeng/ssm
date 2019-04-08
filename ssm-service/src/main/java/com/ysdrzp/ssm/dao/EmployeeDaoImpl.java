package com.ysdrzp.ssm.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author zhipeng zhai
 * @date 2019/4/8 0008
 */
public class EmployeeDaoImpl implements IEmployeeDao{

    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void save(Employee employee) {
        jdbcTemplate.update("insert into employee(name,age) values(?,?)", employee.getName(), employee.getAge());
    }

    public void update(Employee employee) {
        jdbcTemplate.update("update employee set age = ? where id = ?", employee.getAge(), employee.getId());
    }

    public void delete(Long id) {
        jdbcTemplate.update("delete from employee where id = ?",id);
    }

    public Employee get(Long id) {
        List<Employee> list = jdbcTemplate.query("select id,name,age from employee where id = ?", new Object[]{id}, new RowMapper<Employee>() {
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
        return jdbcTemplate.query("select id,name,age from employee", new Object[]{}, new RowMapper<Employee>() {
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
