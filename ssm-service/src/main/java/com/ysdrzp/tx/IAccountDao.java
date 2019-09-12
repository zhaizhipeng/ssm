package com.ysdrzp.tx;

/**
 * @author zhipeng zhai
 * @date 2019/4/9 0009
 */
public interface IAccountDao {

    /**
     * 转入
     * @param id
     * @param in
     */
    void transferIn(long id, double in);

    /**
     * 转出
     * @param id
     * @param out
     */
    void transferOut(long id, double out);
}
