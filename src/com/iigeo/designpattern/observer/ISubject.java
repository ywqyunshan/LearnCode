package com.iigeo.designpattern.observer;

/**
 * 被观察者顶级接口
 */
public interface ISubject {

    /**
     * 注册观察者
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     */
    void removeObserver(Observer observer);

    /**
     * 通知Observer
     */
    void notifyObserver();

}
