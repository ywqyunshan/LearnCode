package com.iigeo.designpattern.decorator;

/**
 * 被装饰器-实现顶级接口
 */
public class XiaoYang implements Persion {
    @Override
    public Double cost() {
        return 0.0;
    }

    @Override
    public void show() {
        System.out.println("初始状态");
    }
}
