package com.SpringCore.withOutXmlConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = applicationContext.getBean("student", Student.class);
        student.study();

        Alien alien = applicationContext.getBean(Alien.class);
        alien.setAge(20);
        System.out.println(alien.getAge());
        alien.code();
    }
}
