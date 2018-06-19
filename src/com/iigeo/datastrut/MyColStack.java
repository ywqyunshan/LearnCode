package com.iigeo.datastrut;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * 顺序列表实现栈
 */
public class MyColStack {

    private ArrayList arrayList;

    MyColStack(){
        arrayList=new ArrayList();
    }

    public void push(Object object){
        arrayList.add(object);

    }

    public Object pop(){
        if (arrayList.size()==0)new EmptyStackException();
        return arrayList.remove(arrayList.size()-1);
    }

    public Object peek(){
        if (arrayList.size()==0)new EmptyStackException();
        return arrayList.get(arrayList.size()-1);
    }
}
