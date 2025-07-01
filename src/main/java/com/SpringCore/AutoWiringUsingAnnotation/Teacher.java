package com.SpringCore.AutoWiringUsingAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "teacher")
//@Scope("prototype") 
public class Teacher {
    @Value("Saran")
    private String name;
    @Value("saran@outlook.com")
    private String mailId;

    @Value("#{subjects}")
    private List<String> subject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public List<String> getSubject() {
        return subject;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", mailId='" + mailId + '\'' +
                ", subject=" + subject +
                '}';
    }
}
