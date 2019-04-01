package com.ysdrzp.ssm.ioc;

import org.springframework.beans.factory.FactoryBean;

public class HelloIocFactoryBean implements FactoryBean<HelloIoc> {

    public HelloIoc getObject() throws Exception {
        return new HelloIoc();
    }

    public Class<?> getObjectType() {
        return null;
    }

    public boolean isSingleton() {
        return false;
    }

}
