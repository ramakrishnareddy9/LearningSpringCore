package com.SpringCore.withOutXmlConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.SpringCore.withOutXmlConfig")
public class SpringConfig {
//    you can either use @Bean annotation or use @Configuration annotation
//    @Bean(name = {"student","temp","demo"})
//    public Student student(){
//        return new Student();
//    }
}
