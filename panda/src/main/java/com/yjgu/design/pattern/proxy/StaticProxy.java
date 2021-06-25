package com.yjgu.design.pattern.proxy;

public class StaticProxy implements Person {

    private Person target;

    StaticProxy(Person target) {
        this.target = target;
    }

    @Override
    public void study() {
        System.out.println("我叫张三");
        target.study();
    }
}
