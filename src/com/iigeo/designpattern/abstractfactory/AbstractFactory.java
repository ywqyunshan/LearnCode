package com.iigeo.designpattern.abstractfactory;

import com.iigeo.designpattern.singlefactory.Girl;

public abstract class AbstractFactory {
    public abstract Girl createGirl(String girlType);
}
