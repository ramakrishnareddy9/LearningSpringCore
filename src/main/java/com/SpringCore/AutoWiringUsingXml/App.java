package com.SpringCore.AutoWiringUsingXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config-AutoWiringUsingXml.xml");
        Employee employee = applicationContext.getBean("employee",Employee.class);
        System.out.println(employee);

        Emp employee1 = applicationContext.getBean("employee1", Emp.class);
        System.out.println(employee1);
    }
}
