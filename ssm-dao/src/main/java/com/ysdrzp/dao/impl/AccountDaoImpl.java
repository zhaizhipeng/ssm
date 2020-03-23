package com.ysdrzp.dao.impl;

import com.ysdrzp.dao.IAccountDao;
import com.ysdrzp.model.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 账户持久层实现类
 */
@Repository("accountDao")
public class AccountDaoImpl implements IAccountDao {

    @Override
    public void save(Account account) {
        System.out.println("保存账户");
    }

    @Override
    public List<Account> findAll() {
        System.out.println("查询所有账户");
        return null;
    }
}
