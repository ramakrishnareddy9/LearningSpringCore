package com.SpringCore.spEl;

import org.springframework.context.ApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new org.springframework.context.support.ClassPathXmlApplicationContext("spring-config-spEl.xml");
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);
    }
}
