package com.ysdrzp.aop.xml;

import org.aspectj.lang.ProceedingJoinPoint;

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

    public void close(){
        System.out.println("关闭资源");
    }

    public void around(ProceedingJoinPoint joinPoint){
        begin();
        try {
            joinPoint.proceed();
            commit();
        }catch (Throwable throwable) {
            throwable.printStackTrace();
            rollBack();
        } finally {
            close();
        }
    }
}
