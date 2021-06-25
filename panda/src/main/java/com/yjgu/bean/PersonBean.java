package com.yjgu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.stereotype.Component;


@Component
public class PersonBean implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {

    String name;

    int age;

    public PersonBean(){
        System.out.println("调用了PersonBean的构造器");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("调用了Name的set方法");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("调用了Age的set方法");
        this.age = age;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("获取beanFactory"+"  "+beanFactory);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("获取beanName id值"+"  "+s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("调用了DiposibleBean.destory()方法...");
    }

    // 这是InitializingBean接口方法
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("调用了InitializingBean.afterPropertiesSet()方法...");
    }
    //Student的Bean的初始化方法
    public void initStudent() {
        System.out.println("Student的Bean的初始化方法执行....");
    }

    //Student的Bean的销毁方法
    public void destroyStudent() {
        System.out.println("Student的Bean的销毁方法执行....");
    }

}
