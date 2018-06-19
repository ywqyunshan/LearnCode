package com.iigeo.datastrut;

import java.util.NoSuchElementException;

public class MyLinkedStack {

    class Node{
        Node next;
        Object object;

        Node(Object o){
            this.object=o;
        }
        Node(){

        }
    }

    //移动指针
    private Node head;
    private int size;


    public MyLinkedStack() {
        this.head = null;
        size = 0;

    }

    public boolean isEmpty(){
        return this.head==null;
    }

    public int length(){
        return size;
    }

    /**
     * 入栈-在表头插入数据
     * @param o
     */
    public void push(Object o){
        if (o==null) return ;
        Node old=head;
        head=new Node();
        head.object=o;
        head.next=old;
        size++;
    }

    /**
     * 出栈
     * @return
     */
    public Object pop(){
        if (isEmpty()) return new NoSuchElementException("stack ");
        Object item=head.object;
        head=head.next;
        size--;
        return item;
    }

    /**
     * 查看栈顶元素
     * @return
     */
    public Object peek(){
        if (isEmpty()) return new NoSuchElementException("stack ");
        Object item=head.object;
        return item;
    }
}
