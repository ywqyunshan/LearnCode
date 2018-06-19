package com.iigeo.datastrut;

/**
 * 数组实现队列
 */
public class MySeqQueue {

    private Object[] value; //存储元素；
    private int front;
    private int rear;

    MySeqQueue(int length){
        value=new Object[Math.abs(length)];
        front=-1;
        rear=-1;
    }

    MySeqQueue(){
        this(16);
    }

    public boolean isEmpty(){
        return front==-1&&rear==-1;
    }

    //扩展容量
    void ensureCap(int size){
        Object[] T=value;
        value=new Object[size];
        for (int i=0;i<T.length;i++){
            value[i]=T[i];
        }
    }

    //入队
    public boolean enqueue(Object o){
        if (o!=null) return false;
        if (isEmpty()) {
            value[0]=o;
            front++;
            rear++;
        }else {
            if (rear==value.length-1){
                ensureCap(value.length*2);
            }
            value[++rear]=o;

        }
        return true;
    }

    //出队
    public Object dequeue(){
        if (isEmpty())return null;
        Object temp=value[front];
        front++;
        return temp;
    }

}
