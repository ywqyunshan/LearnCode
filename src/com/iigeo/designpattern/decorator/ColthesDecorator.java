package com.iigeo.designpattern.decorator;

/**
 * 装饰器超类也要实现顶级接口
 */
public abstract class ColthesDecorator implements Persion{
    protected Persion persion;
    //装饰器要使用被装饰器对象构造方法
    public ColthesDecorator(Persion persion) {
        this.persion=persion;
    }
}
