package com.SpringCore.spEl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("ramu")
    private String name;
    @Value("#{10 + 20}")
    private int age;
    @Value("#{19 > 18 ? true : false }")
    private boolean canVote;

    // calling static methods
    @Value("#{T(com.SpringCore.spEl.Demo).marks()}")
    private double marks;
    // calling static varable
    @Value("#{T(com.SpringCore.spEl.Demo).id}")
    private int stId;
    // calling object methods
    @Value("#{new java.lang.String ('ramakrishnareddy')}")
    private String name1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isCanVote() {
        return canVote;
    }

    public void setCanVote(boolean canVote) {
        this.canVote = canVote;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public int getStId() {
        return stId;
    }

    public void setStId(int stId) {
        this.stId = stId;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", canVote=" + canVote +
                ", marks=" + marks +
                ", stId=" + stId +
                ", name1='" + name1 + '\'' +
                '}';
    }
}
