package com.iigeo.datastrut;

/**
 * 单链表实现
 */
public class MySingleLinkedList {

    /**
     * 定义单链表结构
     */
    class Node{
        Object e;   //存储内容
        Node next;  //指向下一个节点


        //非头结点构造
        Node(Object e,Node node){

            this.e=e;
            this.next=node;
        }

        Node(Object e){
            this.e=e;
        }
    }

    private Node head;//头指针


    MySingleLinkedList(Node node){
        this.head=node;
    }

    MySingleLinkedList(){

    }

    /**
     * 链表是否为空
     * @return
     */
    public boolean  isEmpty(){
        return this.head==null;
    }

    /**
     *
     * 链表长度
     * @return int
     */
    public int length(){
        //定义一个指针，依次遍历,不要改变头指针
        Node p=this.head;
        int i=0;
        while (p!=null){
            i++;
            p=p.next;
        }
        return i;

    }

    /**
     * 链表添加元素
     * @param index
     * @param object
     * @return
     */
    public boolean add(int index,Object object){
        if (object==null) return false;
        Node q=new Node(object);
        if (this.head==null||index<=0){
            //1.如果链表为空时，或者表头插入数据
            q.next=this.head;
            this.head=q;
        }else {
            //2.中间或者结尾插入数据
            Node p=head;
            int i=0;
            while (p.next!=null&&i<index-1){
                i++;
                p=p.next;
            }
            q.next=p.next; //赋值q执行
            p.next=q;


        }
        return true;
    }

    /**
     * 获取位置
     * @param index
     * @return
     */
    public Object get(int index){
        Node p=head;
        int i=0;
        while (p!=null&&i<index){
            i++;
            p=p.next;
        }
        if (p!=null )return p.e;
        return null;

    }

    /**
     * 设置某个位置的变化
     * @param index
     * @param object
     * @return
     */
    public boolean set(int index,Object object) {
        if (head!=null&&object!=null){
            Node p=head;
            int i=0;
            while (p!=null&&i<index){
                i++;
                p=p.next;
            }
            if (p!=null)p.e=object;
            return true;
        }
        return false;
    }

    public boolean remove(int index){

        if (head!=null&&index>=0){
            if (index==0) {
                head=head.next;
            }else {
                Node p=head;
                int i=0;
                while (p!=null&&i<index-1){
                    i++;
                    p=p.next;
                }
                if (p!=null&&p.next!=null){
                    p.next=p.next.next;
                }
            }
            return true;
        }
        return false;

    }

    public void clear(){
        head=null;

    }

}
