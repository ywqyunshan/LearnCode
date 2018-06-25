package com.iigeo.designpattern.signleton;

/**
 * lazy loading
 */
public class SingleObject {

    private static SingleObject instance;

    public SingleObject() { }

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
