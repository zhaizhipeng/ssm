package com.ysdrzp.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * @author zhipeng zhai
 * @date 2019/4/9 0009
 */
@Repository
public class AccountDaoImpl implements IAccountDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dateSource){
        this.jdbcTemplate = new JdbcTemplate(dateSource);
    }

    public void transferIn(long id, double in) {
        jdbcTemplate.update("update account_info set balance = balance + ? where id = ?", in, id);
    }

    public void transferOut(long id, double out) {
        jdbcTemplate.update("update account_info set balance = balance - ? where id = ?", out, id);
    }
}
