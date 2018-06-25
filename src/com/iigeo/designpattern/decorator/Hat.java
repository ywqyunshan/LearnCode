package com.iigeo.designpattern.decorator;

public class Hat extends ColthesDecorator {

    public Hat(Persion persion) {
        super(persion);
    }

    @Override
    public Double cost() {
        return persion.cost()+100;
    }

    @Override
    public void show() {
        persion.show();
        System.out.println("帽子累计消费"+cost());
    }
}
