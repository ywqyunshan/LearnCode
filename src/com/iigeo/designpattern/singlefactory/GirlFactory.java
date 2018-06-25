package com.iigeo.designpattern.singlefactory;

/**
 * 工厂
 */
public class GirlFactory  {

    public Girl createGirl(String girlType){

        Girl girl=null;
        if (girlType.equals("fat")){
            girl=new FatGirl();
        }else if (girlType.equals("thin")){
            girl=new ThinGirl();
        }
        return girl;
    }
}
