package com.ysdrzp.ssm.di.setter;

public class Children {

    /**
     * 性别
     */
    private String sex;

    /**
     * 年龄
     */
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
