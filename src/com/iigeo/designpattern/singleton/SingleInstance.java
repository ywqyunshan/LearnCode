package com.iigeo.designpattern.singleton;

/**
 * 单例模式--Not Lazy loading
 */
public class SingleInstance {
    //初始化内存开销可能大
    private static SingleInstance instance=new SingleInstance();

    //声明为private，减少使用默认构造函数，实例化
    private SingleInstance() {

    }
    public static SingleInstance getInstance(){
        return  instance;
    }
}
