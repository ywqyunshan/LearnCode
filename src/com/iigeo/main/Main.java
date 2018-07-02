package com.iigeo.main;

import com.iigeo.base.Reserve;
import com.iigeo.concurrent.DemoSocketServer;
import com.iigeo.datastrut.MyArraryList;
import com.iigeo.datastrut.MyLinkedQueue;
import com.iigeo.datastrut.MyLinkedStack;
import com.iigeo.designpattern.decorator.Hat;
import com.iigeo.designpattern.decorator.Jack;
import com.iigeo.designpattern.decorator.Persion;
import com.iigeo.designpattern.decorator.XiaoYang;
import com.iigeo.designpattern.observer.*;
import com.iigeo.designpattern.strategy.Apple;
import com.iigeo.designpattern.strategy.ObjectPredicate;
import com.iigeo.designpattern.strategy.WeightPredicate;
import com.iigeo.find.BinarySearch;
import com.iigeo.find.FindString;
import com.iigeo.recurison.Factorial;
import com.iigeo.sort.MySort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //test--调用顺序列表
        /*MyArraryList myArraryList=new MyArraryList(2);
        System.out.println(myArraryList.hashCode());
        myArraryList.addItem(0,"e");
        System.out.println(myArraryList.getItem(0));
        myArraryList.addItem(1,"m");
        System.out.println(myArraryList.getItem(1));
        myArraryList.setItem(1,"c");
        System.out.println(myArraryList.getItem(1));
        myArraryList.remove(0);
        System.out.println(myArraryList.getItem(0));*/

        //test--调用栈
       /*MyLinkedStack myArraryStack=new MyLinkedStack();
       myArraryStack.push("a");
       myArraryStack.push("b");
       myArraryStack.push("c");
       System.out.println(myArraryStack.pop());
       System.out.println(myArraryStack.peek());
       System.out.println(myArraryStack.pop()); */

        //test--调用队列
      /* MyLinkedQueue myLinkedQueue=new MyLinkedQueue();
       myLinkedQueue.enqueue("a");
       myLinkedQueue.enqueue("b");
       myLinkedQueue.enqueue("c");
       System.out.println(myLinkedQueue.dequeue());
       System.out.println(myLinkedQueue.peek());
       System.out.println(myLinkedQueue.dequeue());*/

       //test--调用单链表
       /* MySingleLinkedList mySingleLinkedList=new MySingleLinkedList();
       mySingleLinkedList.add(0,"a");
       mySingleLinkedList.add(1,"b");
        mySingleLinkedList.add(2,"c");
       System.out.println(mySingleLinkedList.get(1));
       mySingleLinkedList.add(1,"d");
        System.out.println(mySingleLinkedList.get(1));
       System.out.println(mySingleLinkedList.length());*/

      //Test--调用双链表
       /*MyDoubleLinkedList myDoubleLinkedList=new MyDoubleLinkedList();
       myDoubleLinkedList.add(0,"a");
       myDoubleLinkedList.add(1,"b");
       System.out.println(myDoubleLinkedList.get(0));
       myDoubleLinkedList.add(2,"c");
       System.out.println(myDoubleLinkedList.get(2));
       myDoubleLinkedList.set(1,"d");
       System.out.println(myDoubleLinkedList.get(1));*/

       //Test--排序
       /*int[] arrs={7,9,1,37,21,29,39};
        System.out.println(Arrays.toString(arrs));
       MySort mySort=new MySort(arrs);
       mySort.qSort(0,arrs.length-1);
       System.out.println("插入排序"+Arrays.toString(arrs));*/

       //Test--逆序
       /*int[] ints={3,5,9,2,10,8};
        System.out.println(Arrays.toString(ints));
       Reserve reserve=new Reserve(ints);
       reserve.reserve();
       System.out.println(Arrays.toString(ints));*/

       //Test--二分法查找
       /*  int[] ints={3,5,8,9,0,2,7,44,6};
        BinarySearch binarySearch=new BinarySearch(ints);
       int i= binarySearch.indexofByWhie(0,ints.length-1,1);
       System.out.println(i);*/

       //Test---查找字符串
        /*FindString findString=new FindString("AAABBBccccddd2222333dddddd4ee");
        findString.findMostStr();*/

        //Test---递归阶乘
      /*  Factorial factorial=new Factorial();
        System.out.println(factorial.factoial(3));
        System.out.println(factorial.factoial(1));*/


        //TEST-策略模式
        /*List<Apple>  appleList=new ArrayList<>();
        appleList.add(new Apple(120,"green"));
        appleList.add(new Apple(150,"green"));
        appleList.add(new Apple(130,"red"));
        appleList.add(new Apple(160,"blue"));
        filterApple(appleList,new WeightPredicate());
        //Lambda表达式简化写法
        filterApple(appleList,apple ->apple.getWeight()>150);*/

        //Test-装饰器模式
       /* Persion xiaoyang=new XiaoYang();
        xiaoyang=new Hat(xiaoyang);
        xiaoyang=new Jack(xiaoyang);
        xiaoyang.cost();
        xiaoyang.show();;*/

       //Test-观察者模式
      /*  ISubject subject=new Observerable();
        Observer observerA=new ObserverA();
        Observer observerB=new ObserverB();
        subject.registerObserver(observerA);
        subject.registerObserver(observerB);
        subject.notifyObserver();*/

      //TEST-socket通信
        DemoSocketServer.initSocketServer();
    }

    //TEST-策略模式
    static List<Apple> filterApple(List<Apple> appleList, ObjectPredicate<Apple> objectPredicate){
        List<Apple> apples=new ArrayList<>();
        for (Apple apple:appleList){
            objectPredicate.filter(apple);
            apples.add(apple);
        }
        return apples;
    }

}
