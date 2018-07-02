package com.iigeo.designpattern.singleton;

/**
 * lazy loading
 */
public class SingleObject {


    private static SingleObject instance;

    //声明为private，减少使用默认构造函数，实例化
    private SingleObject() { }

    public static SingleObject getInstance() {
        // lazy loading
        if (instance==null){
            instance=new SingleObject();
        }
        return instance;
    }

    /**
     * 线程安全
     * @return
     */
    public synchronized  SingleObject getSysInstance(){
        if (instance==null) instance=new SingleObject();
        return instance;
    }
}
