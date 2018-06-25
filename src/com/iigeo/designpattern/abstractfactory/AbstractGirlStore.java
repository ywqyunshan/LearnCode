package com.iigeo.designpattern.abstractfactory;

import com.iigeo.designpattern.singlefactory.Girl;

/**
 * 工厂提供者
 */
public class AbstractGirlStore {

    private AbstractFactory factory;

    public AbstractGirlStore(AbstractFactory factor) {
        this.factory = factory;
    }

    public Girl createGirl(String whatYouLike){
        return factory.createGirl(whatYouLike);
    }
}
