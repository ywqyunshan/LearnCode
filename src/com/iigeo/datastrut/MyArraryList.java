package com.iigeo.datastrut;

/**
 * 用数组实现线性顺序表
 * Java的ArrayList默认就是用动态数据实现的
 */
public class MyArraryList {

    private Object[] elementDatas;
    private int MAXSZIE=10;//数组默认分配长度
    private int size=0;//数组当前的下标

    public MyArraryList(int length) {
        this.MAXSZIE=length;
        this.elementDatas=new Object[length];
    }

    public MyArraryList(){
        this(10);
    }

    //添加元素
    public boolean addItem(Object e){
        if (size==MAXSZIE){
            return false;
        }else {
            elementDatas[size++]=e;
        }
        return  true;
    }

    //指定位置添加元素
    public boolean addItem(int index,Object e ){
        if (size==MAXSZIE) {
            ensureCap(size*2);
        }
        if (index<0||index>size){
            return false;   //index不在范围内
        }
        if (index<=size){
            for (int k=size;k>=index;k--){
                //插入位置的数据向后移动一位
                elementDatas[k+1]=elementDatas[k];
            }
        }
        elementDatas[index]=e;
        size++;
        return true;
    }

    //动态扩容
    void ensureCap(int cap){
        Object[] T=elementDatas;
        MAXSZIE=cap;
        elementDatas=new Object[cap];
        for (int i=0;i<cap;i++){
            elementDatas[i]=T[i];
        }

    }

    //获取元素
    public Object getItem(int index){
        if (index<0||index>size){
            return null;
        }
        return elementDatas[index];
    }

    //修改
    public void setItem(int index ,Object object){
        if (index<0||index>size){
           throw new IndexOutOfBoundsException();
        }
        elementDatas[index]=object;

    }

    public boolean remove(int index){
        if (size==0){
            return false;
        }
        if (index<0||index>size){
            return false;
        }
        if (index<=size){
            int k;
            //删除数据的位置向前移动一位
            for (k=index;k<size;k++){
                elementDatas[k]=elementDatas[k+1];
            }
            elementDatas[size]=null;
            size--;
        }
        return true;
    }
}
