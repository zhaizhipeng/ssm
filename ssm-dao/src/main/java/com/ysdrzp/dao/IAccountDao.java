package com.ysdrzp.dao;

import com.ysdrzp.model.Account;

import java.util.List;

/**
 * 账户持久层接口
 */
public interface IAccountDao {

    /**
     * 保存
     * @param account
     */
    void save(Account account);

    /**
     * 查询所有
     * @return
     */
    List<Account> findAll();
}
