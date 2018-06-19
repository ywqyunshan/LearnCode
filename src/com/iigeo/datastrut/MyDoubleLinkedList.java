package com.iigeo.datastrut;

/**
 *
 * 双链表实现
 *
 */
public class MyDoubleLinkedList {

    class Node{

        private Object data;
        private Node prev;  //前指针
        private Node next;  //后指针

        Node(){

        }
        //构造节点
        Node(Object data){
            this.data=data;
        }
    }



    private Node head; //头指针
    private int size;// 链表索引长度

    public MyDoubleLinkedList(){
        //初始化头指针
        this.head=new Node();
    }


    //尾部添加元素
    public boolean add(Object object){
        if (object!=null){
           Node p= head;
           while (p!=null){
               p=p.next;
           }
           Node q=new Node(object);
           p.next=q;
           q.prev=p;
           size++;
           return true;
        }
        return false;
    }

    //添加指定索引位置的数据
    public boolean add(int index,Object object){
        if(object!=null&&index>=0){
            if (index>size){
                add(object);
            }else {
                Node p=head;//定义移动指针
                int i=0;
                while (p!=null&&i<index){
                    //查找到index的位置
                    i++;
                    p=p.next;
                }
                if (p!=null){
                    Node q=new Node(object); //定义要插入的元素
                    q.prev=p.prev;
                    q.next=p;
                    if (p.prev!=null) p.prev.next=q;
                    p.prev=q;
                    size++;
                }

            }
            return true;
        }
        return false;
    }

    public boolean remove(int index){
        if (index>=0){
            if (index==0) index=1;
            Node p=head;
            int i=0;
            while (p!=null&&i<index){
                i++;
                p=p.next;
            }
            if (p!=null){
                p.prev.next=p.next;
                p.next.prev=p.prev;
            }
            size--;
            return true;

        }
        return false;
    }

    //设置元素
    public boolean set(int index,Object o){
        if (index>=0&&o!=null){
            Node p=head; //定义移动指针；
            int i=0;
            while (p!=null&&i<index){
                i++;
                p=p.next;
            }

            if (p!=null){
                p.data=o;
            }
        }
        return false;
    }

    //获取指定元素
    public Object get(int index){
        if (index>=0){
            Node p=head;
            int i=0;
            while (p!=null&&i<index){
                i++;
                p=p.next;
            }
            if (p.next!=null) return p.data;
        }
        return null;
    }
}


