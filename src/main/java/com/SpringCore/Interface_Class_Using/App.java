package com.SpringCore.Interface_Class_Using;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config-Interface_Class_Using.xml");
        User user = applicationContext.getBean("user", User.class);
        user.usingDatabase();
        user.updatingDatabase();
        user.deletingDatabase();
        NormalMethod normalMethod = applicationContext.getBean("normalMethod", NormalMethod.class);
        normalMethod.normalMethod();
    }
}
