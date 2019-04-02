package com.ysdrzp.ssm.di.setter;

public class House {

    /**
     * 面积
     */
    private double area;

    /**
     * 价格
     */
    private double price;

    public void setArea(double area) {
        this.area = area;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "House{" +
                "area=" + area +
                ", price=" + price +
                '}';
    }
}