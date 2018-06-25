package com.iigeo.designpattern.strategy;

/**
 * 重量过滤实现类
 */
public class WeightPredicate implements ObjectPredicate<Apple>{

    @Override
    public boolean filter(Apple apple) {
        //重量大于150g的苹果
        boolean istrue=apple.getWeight()>150;
        if (istrue)System.out.println(apple.showString());
        return apple.getWeight()>150;
    }
}
