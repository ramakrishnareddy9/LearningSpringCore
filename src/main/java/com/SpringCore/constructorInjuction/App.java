package com.SpringCore.constructorInjuction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config-constructorInjuction.xml");
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);
        Person person1 = applicationContext.getBean("person1", Person.class);
        System.out.println(person1);

        Certificate certificate = applicationContext.getBean("certificate", Certificate.class);
        System.out.println(certificate);
        Certificate certificate1 = applicationContext.getBean("certificate1", Certificate.class);
        System.out.println(certificate1);

        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);
    }
}
