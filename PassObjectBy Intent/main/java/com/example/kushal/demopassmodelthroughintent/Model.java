package com.example.kushal.demopassmodelthroughintent;

import java.io.Serializable;

public class Model implements Serializable {
    String name,age;

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
