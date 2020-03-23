package com.ysdrzp.service;

import com.ysdrzp.model.Account;

import java.util.List;

/**
 * 账户业务层接口
 */
public interface IAccountService {

    /**
     * 保存账户
     * @param account
     */
    void saveAccount(Account account);

    /**
     * 查询所有账户
     * @return
     */
    List<Account> findAllAccount();
}
