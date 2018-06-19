package com.iigeo.datastrut;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * 数组实现栈
 */
public class MyArraryStack {

    private Object[] elementDatas;
    private int maxLength=10; //数组默认初始大小
    private int size;  //内部数组当前下标
    private int top=-1;//栈顶指针

    MyArraryStack(int length){
        this.maxLength=length;
        this.elementDatas=new Object[maxLength];
    }


    MyArraryStack(){
        this(10);
    }

    //压栈
    public void push(Object e){
        if (elementDatas.length==size){
            //动态扩容
            ensureCap(maxLength*2);
        }
        elementDatas[++top]=e;
        size++;
    }


    //弹栈-移除栈顶元素
    public Object pop(){
        if (top==-1) new EmptyStackException();
        size--;
        return elementDatas[top--];
    }

    //获取栈顶元素
    public Object peek(){
        if (top==-1) new EmptyStackException();
        return elementDatas[top];
    }

    @Override
    public String toString() {
        return Arrays.toString(elementDatas);
    }

    //动态扩容
    void ensureCap(int cap){
        if (cap<size)return;
        maxLength=cap;
        Object[] t=elementDatas;
        elementDatas=new Object[cap];
        for (int i=0;i<size;i++){
            elementDatas[i]=t[i];
        }

    }
}
