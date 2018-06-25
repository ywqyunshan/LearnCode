package com.iigeo.designpattern.strategy;

/**
 * y颜色过滤实现类
 */
public class ColorPredicate implements ObjectPredicate<Apple> {
    @Override
    public boolean filter(Apple data) {
        //绿色苹果
        boolean istrue=data.getColor().equals("green");
        if (istrue) System.out.println(data.showString());
        return data.getColor().equals("green");
    }
}
