package com.SpringCore.lifeCycleBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("spring-config-lifeCycleBean.xml");
        // registering shutdown hook for destroying beans
        applicationContext1.registerShutdownHook();
        LifeCycleUsingXml demo = applicationContext1.getBean("demo", LifeCycleUsingXml.class);
        System.out.println(demo);

        LifeCycleUsingInterface demo1 = applicationContext1.getBean("demo1", LifeCycleUsingInterface.class);
        System.out.println(demo1);

        LifeCycleUsingAnnotations demo2 = applicationContext1.getBean("demo2", LifeCycleUsingAnnotations.class);
        System.out.println(demo2);
    }
}
