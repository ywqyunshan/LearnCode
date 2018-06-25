package com.iigeo.designpattern.singlefactory;

/**
 * 工厂提供者
 */
public class GirlStore {
    private GirlFactory factory;

    public GirlStore(GirlFactory factor) {
        this.factory = factory;
    }

    public Girl createGirl(String girlType){
        return factory.createGirl(girlType);
    }
}
