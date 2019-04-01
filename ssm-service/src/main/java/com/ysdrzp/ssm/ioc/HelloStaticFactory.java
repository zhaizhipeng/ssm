package com.ysdrzp.ssm.ioc;

/**
 * 静态工厂
 */
public class HelloStaticFactory {

    public HelloStaticFactory(){
        System.out.println("静态工厂方法构造函数");
    }

    // 静态工厂方法
    public static HelloIoc getInstances(){
        return new HelloIoc();
    }
}
