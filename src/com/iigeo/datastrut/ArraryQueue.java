package com.iigeo.datastrut;

/**
 * 数组循环队列
 */
public class ArraryQueue {
    //数据
    private Object[] items;
    //头指针
    private int tail=0;
    //尾指针
    private int head=0;

    private int defaultSize=3;

    public ArraryQueue(){
        this.items=new Object[defaultSize];

    }

    public boolean isEmpty(){
        return head==tail;
    }

    /**
     * 入队
     * @param element
     */
    public void enqueue(Object element){
        if (element==null) return;
        //队列是否已满
        if ((tail+1)%defaultSize==head) return;
        items[tail]=element;
        tail=(tail+1)%defaultSize;
    }

    /**
     * 出队
     * @return
     */
    public Object dequeue(){
        if (isEmpty())return null;
        Object element=items[head];
        head=(head+1)%defaultSize;
        return element;
    }


}
