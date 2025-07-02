package com.SpringCore.withOutXmlConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.SpringCore.withOutXmlConfig")
public class SpringConfig {
//    you can either use @Bean annotation or use @Component annotation
//    either we use bean or component we use component on top of class
    /*
    @Bean(name = {"student","temp","demo"})
    public Student student(){
        return new Student();
    }

//    tight coupling
//    @Bean
//    public Alien alien(){
//        Alien obj = new Alien();
//        obj.setCom(new Desktop());
//        return obj;
//    }


//    @Bean
//    public Alien alien(Computer com){
//        Alien obj = new Alien();
//        obj.setCom(com);
//        return obj;
//    }
//
//    @Bean
//    public Desktop desktop(){
//        return new Desktop();
//    }

//    this work because there is no other object of computer like desktop but down we have two objects desktop and laptop


//    so we use Qulifier annotation or we can remove qulifier and use Primary annotation
    @Bean
    public Alien alien(@Qualifier("desktop") Computer com){
        Alien obj = new Alien();
        obj.setCom(com);
        return obj;
    }

    @Bean
//    @Qualifier("desktop")
    public Desktop desktop(){
        return new Desktop();
    }

    @Bean
//    @Primary
    public Laptop laptop(){
        return new Laptop();
    }
     */
}
