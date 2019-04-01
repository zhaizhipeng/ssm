package com.ysdrzp.ssm.di.constructor;

public class OtherBean {

    private String name;

    private int age;

    public OtherBean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "OtherBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
