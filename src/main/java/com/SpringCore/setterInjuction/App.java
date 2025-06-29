package com.SpringCore.setterInjuction;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config-setterInjuction.xml");
        //  Setter Injection
//        Student student = applicationContext.getBean(Student.class);
//        System.out.println(student);
        Student student = applicationContext.getBean("student",Student.class);
        System.out.println(student);
        Student student1 = applicationContext.getBean("student1",Student.class);
        System.out.println(student1);
        Student student2 = applicationContext.getBean("student2",Student.class);
        System.out.println(student2);
        Student student3 = applicationContext.getBean("student3",Student.class);
        System.out.println(student3);

        Employee employee = applicationContext.getBean("employee",Employee.class);
        System.out.println(employee);
        System.out.println(employee.getCourses().getClass().getName());

        Car car = applicationContext.getBean("car",Car.class);
        System.out.println(car);
        Car car1 = applicationContext.getBean("car1",Car.class);
        System.out.println(car1);
    }
}
