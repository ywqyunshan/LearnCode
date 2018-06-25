package com.iigeo.designpattern.abstractfactory;

import com.iigeo.designpattern.singlefactory.Girl;
import com.iigeo.designpattern.singlefactory.WhiteGirl;

public class AmericanFactory extends AbstractFactory {
    @Override
    public Girl createGirl(String girlType) {
        Girl girl=null;
        if (girlType.equals("americanwhite"))
            girl=new WhiteGirl();
        return girl;
    }
}
