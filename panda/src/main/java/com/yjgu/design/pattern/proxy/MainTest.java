package com.yjgu.design.pattern.proxy;

import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;

public class MainTest {

    public static void main(String[] args) {

        Person person = new PersonImp();

        StaticProxy staticProxy = new StaticProxy(person);
        staticProxy.study();

        DynamicProxy dynamicProxy = new DynamicProxy(person);

        Person o = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class}, dynamicProxy);
        o.study();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(User.class);
        enhancer.setCallback(new CglibProxy());
        User o1 = (User) enhancer.create();
        o1.add();
    }
}
