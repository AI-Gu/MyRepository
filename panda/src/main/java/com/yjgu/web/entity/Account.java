package com.yjgu.web.entity;

import java.io.Serializable;

public class Account implements Serializable {
    private String name;

    private Integer amount;

    private static final long serialVersionUID = 1L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}