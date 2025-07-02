package com.SpringCore.AutoWiringUsingXml;

public class Laptop {
    private Computer computer;

    public Laptop() {
    }

    public Laptop(Computer computer) {
        this.computer = computer;
    }
    public void compile(){
        computer.compile();
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
