package com.SpringCore.AutoWiringUsingAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import com.SpringCore.AutoWiringUsingAnnotation.Address;
import org.springframework.beans.factory.annotation.Qualifier;

// @Autowired annotation is above property or constructor for construcor injection on setter method for property injection
// @Qualifier annotation is used to specify the bean name if there are multiple beans of same type

public class Employee {
    private String name;
    @Autowired
    @Qualifier("address1")
    private Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
