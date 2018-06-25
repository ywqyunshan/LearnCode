package com.iigeo.designpattern.singleton;

/**
 * 单例模式--Not Lazy loading
 */
public class SingleInstance {
    private static SingleInstance instance=new SingleInstance();

    public SingleInstance() {
    }

    public static SingleInstance getInstance(){
        return  instance;
    }
}
