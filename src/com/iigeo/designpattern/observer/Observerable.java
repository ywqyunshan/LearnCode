package com.iigeo.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者实现类
 */
public class Observerable implements ISubject {

    public List<Observer> observerList=new ArrayList<>();
    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer:observerList){
            observer.update();
        }
    }
}
