package com.SpringCore.AutoWiringUsingXml;

public class Desktop implements Computer{
    public Desktop() {
        System.out.println("Desktop constructor is called");
    }

    @Override
    public void compile() {
        System.out.println( "Compiling using desktop");
    }
}
