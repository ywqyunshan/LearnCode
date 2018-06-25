package com.iigeo.datastrut;

import java.util.NoSuchElementException;

/**
 * 链表实现循环队列
 */
public class MyLinkedQueue {

    public MyLinkedQueue() {
        head=null;
        tail=null;
        n=0;
    }

    class Node{
        Node next;
        Object object;

        Node(Object o){
            this.object=o;
        }
        Node(){
        }
    }

    //头节点
    Node head;
    //尾节点
    Node tail;
    int n;

    public boolean isEmpty(){
        return head==null;
    }

    public int length(){
        return n;
    }

    /**
     * 入队
     */
    public void enqueue(Object o){
        if (o==null) return;
        Node old=tail;
        tail=new Node();
        tail.object=o;
        tail.next=null;
        if (isEmpty()) head=tail;
        else old.next=tail;
        n++;
    }

    /**
     * 出队
     */
    public Object dequeue(){
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
           Object o=head.object;
           head=head.next;
           n--;
           if (isEmpty())tail=null;
           return o;

    }

    public Object peek() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        return head.object;
    }

}
