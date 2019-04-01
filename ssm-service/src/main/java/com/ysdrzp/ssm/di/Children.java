package com.ysdrzp.ssm.di;

public class Children {

    private String sex;

    private String name;

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Children{" +
                "sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
