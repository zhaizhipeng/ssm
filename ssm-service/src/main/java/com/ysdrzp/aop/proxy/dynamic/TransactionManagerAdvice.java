package com.ysdrzp.aop.proxy.dynamic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhipeng zhai
 * @date 2019/4/4 0004
 */
@Component
public class TransactionManagerAdvice implements InvocationHandler {

    public TransactionManagerAdvice(){
        System.out.println("创建TransactionManagerAdvice对象");
    }

    Object target;

    public void setObject(Object target) {
        this.target = target;
    }

    @Autowired
    private TransactionManager txManager;

    // 获取代理对象
    public <T> T getProxyObject() {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this
        );
    }

    public Object invoke(Object proxy, Method method, Object[] args) {
        txManager.begin();
        try {
            method.invoke(target, args);
            txManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            txManager.rollBack();
        }
        return null;
    }
}
