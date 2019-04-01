package com.ysdrzp.ssm.di.setter;

import java.util.*;

/**
 * 家庭
 */
public class Family {

    /**
     * 丈夫
     */
    private String husband;

    /**
     * 妻子
     */
    private String wife;

    /**
     * 房子
     */
    private House house;

    /**
     * 孩子
     */
    private List<Children> children;

    private String[] arrays;

    private Set<String> set;

    private Map<String,String> map;

    private Properties properties;

    public void setHusband(String husband) {
        this.husband = husband;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public void setChildren(List<Children> children) {
        this.children = children;
    }

    public void setArrays(String[] arrays) {
        this.arrays = arrays;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Family{" +
                "husband='" + husband + '\'' +
                ", wife='" + wife + '\'' +
                ", house=" + house +
                ", children=" + children +
                ", arrays=" + Arrays.toString(arrays) +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
