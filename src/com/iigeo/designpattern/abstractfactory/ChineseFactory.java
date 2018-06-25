package com.iigeo.designpattern.abstractfactory;

import com.iigeo.designpattern.singlefactory.FatGirl;
import com.iigeo.designpattern.singlefactory.Girl;
import com.iigeo.designpattern.singlefactory.ThinGirl;

/**
 * 工厂提供者1
 */
public class ChineseFactory extends AbstractFactory {

    @Override
    public Girl createGirl(String girlType) {
        Girl girl=null;
        if (girlType.equals("fat")){
            girl=new FatGirl();
        }else if (girlType.equals("thin")){
            girl=new ThinGirl();
        }
        return girl;
    }



}
