package com.SpringCore.UsingCollections;

import org.springframework.context.ApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new org.springframework.context.support.ClassPathXmlApplicationContext("spring-config-UsingCollections.xml");

        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);

        Employee employee = applicationContext.getBean("employee", Employee.class);
        System.out.println(employee);

        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);
        System.out.println(person.getCourses().getClass().getName());

    }
}
