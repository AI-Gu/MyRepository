package com.yjgu.design.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy<T> implements InvocationHandler {

    private T tagrt;

    DynamicProxy(T tagrt) {
        this.tagrt = tagrt;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理执行" + method.getName() + "方法");
        Object invoke = method.invoke(tagrt, args);
        return invoke;
    }
}
