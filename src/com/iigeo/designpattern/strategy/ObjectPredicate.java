package com.iigeo.designpattern.strategy;

/**
 * 顶级接口
 * @param <T>
 */
public interface ObjectPredicate<T> {

     boolean filter(T data);

}
