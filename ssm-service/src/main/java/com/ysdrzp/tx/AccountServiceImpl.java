package com.ysdrzp.tx;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhipeng zhai
 * @date 2019/4/9 0009
 */
@Service
public class AccountServiceImpl implements IAccountService {

    @Resource
    private IAccountDao accountDao;

    public void transfer(long inId, long outId, double balance) {
        accountDao.transferOut(outId,balance);
        accountDao.transferIn(inId,balance);
    }
}
