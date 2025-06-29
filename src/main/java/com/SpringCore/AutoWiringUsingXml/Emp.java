package com.SpringCore.AutoWiringUsingXml;

public class Emp {
    private String name;
    private Add add;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Add getAddress() {
        return add;
    }

    public void setAddress(Add address) {
        this.add = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address=" + add +
                '}';
    }
}
