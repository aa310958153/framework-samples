package com.example.sampleduuboprovidersdk;

import java.io.Serializable;

public class StudentReqDTO implements Serializable {
    private String name;
    private String age;

    public StudentReqDTO(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

