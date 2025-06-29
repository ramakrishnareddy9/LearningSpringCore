package com.SpringCore.lifeCycleBean;

public class LifeCycleUsingXml {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setter method is called");
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        System.out.println("setter method is called");
        this.price = price;
    }
    @Override
    public String toString() {
        return "LifeCycleUsingXml{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void init() {
        System.out.println("init method is called");
    }

    public void destroy() {
        System.out.println("destroy method is called");
    }
}

