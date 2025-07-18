package com.SpringCore.withOutXmlConfig;

import org.springframework.stereotype.Component;

@Component("laptop")
public class Laptop implements Computer{
    public Laptop() {
        System.out.println("Laptop object created");
    }

    @Override
    public void compile()
    {
        System.out.println("Compiling using Laptop");
    }

}
