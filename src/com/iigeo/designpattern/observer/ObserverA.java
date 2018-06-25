package com.iigeo.designpattern.observer;

/**
 * 观察者实现类A
 */
public class ObserverA extends Observer {
    @Override
    public void update() {
        System.out.println("A收到通知");
    }
}
