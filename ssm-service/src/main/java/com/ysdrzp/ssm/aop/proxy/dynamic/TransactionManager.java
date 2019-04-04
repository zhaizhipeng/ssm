package com.ysdrzp.ssm.aop.proxy.dynamic;

public class TransactionManager {

    public void begin(){
        System.out.println("开启事务");
    }

    public void commit(){
        System.out.println("事物提交");
    }

    public void rollBack(){
        System.out.println("关闭事务");
    }
}
