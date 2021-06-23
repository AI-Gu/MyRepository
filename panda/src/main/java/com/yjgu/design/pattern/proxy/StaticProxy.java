package com.yjgu.design.pattern.proxy;

public class StaticProxy implements Image {

    private RealImage realImage;

    private String fileName;

    StaticProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
