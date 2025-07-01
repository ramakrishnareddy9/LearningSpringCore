package com.SpringCore.UsingCollections;

import java.util.List;
import java.util.Map;

public class Person {
    List<String> courses;
    Map<String, Integer> fee;

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Person{" +
                "courses=" + courses +
                '}';
    }
}
