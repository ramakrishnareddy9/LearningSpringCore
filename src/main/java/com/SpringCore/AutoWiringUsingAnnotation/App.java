package com.SpringCore.AutoWiringUsingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config-AutoWiringUsingAnnotation.xml");
        Employee employee = applicationContext.getBean("employee", Employee.class);
        System.out.println(employee);

        Teacher teacher = applicationContext.getBean("teacher", Teacher.class);
        System.out.println(teacher);
    }
}
