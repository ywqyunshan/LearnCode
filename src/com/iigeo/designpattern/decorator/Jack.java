package com.iigeo.designpattern.decorator;

public class Jack extends ColthesDecorator {


    public Jack(Persion persion) {
        super(persion);
    }

    @Override
    public Double cost() {
        return persion.cost()+50;
    }

    @Override
    public void show() {
        persion.show();
        System.out.println("夹克累计消费"+cost());
    }
}
