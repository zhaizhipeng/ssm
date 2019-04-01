package com.ysdrzp.ssm.ioc;

/**
 * 实例工厂
 */
public class HelloInstanceFactory {

    public HelloInstanceFactory(){
        System.out.println("实例工厂方法构造函数");
    }

    public HelloIoc getInstance(){
        HelloIoc instanceIoc = new HelloIoc();
        return instanceIoc;
    }
}
