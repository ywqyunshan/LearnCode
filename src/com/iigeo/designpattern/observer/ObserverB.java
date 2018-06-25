package com.iigeo.designpattern.observer;

/**
 * 观察者实现类B
 */
public class ObserverB extends Observer {
    @Override
    public void update() {
        System.out.println("B收到通知");
    }
}
