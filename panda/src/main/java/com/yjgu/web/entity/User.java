package com.yjgu.web.entity;

import java.io.Serializable;

public class User extends UserKey implements Serializable {

    private Integer age;

    private String address;

    private static final long serialVersionUID = 1L;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}