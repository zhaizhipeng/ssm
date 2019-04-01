package com.ysdrzp.ssm.di.constructor;

import java.util.Map;

public class SomeBean {

    private String name;

    private int age;

    private OtherBean otherBean;

    private Map<String,String> map;

    public SomeBean(String name, int age, OtherBean otherBean, Map<String, String> map) {
        this.name = name;
        this.age = age;
        this.otherBean = otherBean;
        this.map = map;
    }

    @Override
    public String toString() {
        return "SomeBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", otherBean=" + otherBean +
                ", map=" + map +
                '}';
    }
}
