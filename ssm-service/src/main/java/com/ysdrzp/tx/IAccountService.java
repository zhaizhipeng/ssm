package com.ysdrzp.tx;

/**
 * @author zhipeng zhai
 * @date 2019/4/9 0009
 */
public interface IAccountService {

    /**
     * 转账
     * @param inId
     * @param outId
     * @param balance
     */
    void transfer(long inId, long outId, double balance);
}
