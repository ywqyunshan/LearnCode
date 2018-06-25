package com.iigeo.datastrut;

/**
 * 数组实现循环队列
 */
 class MySeqCycleQueue {

     private Object[] objects;  //存储队列的数组元素
     private int front; //队头下标
     private int rear; //队尾下标

    public MySeqCycleQueue(int size){
        objects=new Object[size];
        front=0;
        rear=0;
    }

    public MySeqCycleQueue(){
        this(16);
    }

    public boolean isEmpty(){
        //循环队列在中间也有可能front和rear相同，所以不能用front==rear==0.来判断
        return front==rear;
    }

    /**
     * 入队
     * @param o
     * @return
     */
    public boolean enqueue(Object o){
        if (o!=null) return false;
        if (front==(rear+1)%objects.length){
            //队满——注意队满的情况会预留一个空位，防止front==rear，这里采用了取模运算
            int length=objects.length;
            //动态扩容
            ensureCap(length*2);
        }
        objects[rear]=o;
        rear=(rear+1)%objects.length; //rear下标变化规律，入队移动rear下标
        return true;
    }

    void ensureCap(int size){
        Object[] T=objects;
        objects=new Object[size];
        for (int i=0;i<size;i++){
            objects[i]=T[i];
        }
    }

    /**
     * 出队
     * @return
     */
     boolean dequeue(){
        if (isEmpty()){
            front=(front+1)%objects.length;//出队移动front下标
            return true;
        }
        return false;

    }


}
