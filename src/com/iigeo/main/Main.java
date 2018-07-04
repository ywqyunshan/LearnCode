package com.iigeo.main;

import com.iigeo.concurrent.FirstCountDownWork;
import com.iigeo.concurrent.SemaphoreWork;
import com.iigeo.concurrent.TicketThread;
import com.iigeo.designpattern.strategy.Apple;
import com.iigeo.designpattern.strategy.ObjectPredicate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {

        /*---------------------Test--调用顺序列表----------------------------------*/
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

        /*------------------------Test--调用栈--------------------------------------*/
       /*MyLinkedStack myArraryStack=new MyLinkedStack();
       myArraryStack.push("a");
       myArraryStack.push("b");
       myArraryStack.push("c");
       System.out.println(myArraryStack.pop());
       System.out.println(myArraryStack.peek());
       System.out.println(myArraryStack.pop()); */

        /*-----------------------Test--调用队列--------------------------------------*/
      /* MyLinkedQueue myLinkedQueue=new MyLinkedQueue();
       myLinkedQueue.enqueue("a");
       myLinkedQueue.enqueue("b");
       myLinkedQueue.enqueue("c");
       System.out.println(myLinkedQueue.dequeue());
       System.out.println(myLinkedQueue.peek());
       System.out.println(myLinkedQueue.dequeue());*/

       /*---------------------------Test--调用单链表---------------------------------------*/
       /* MySingleLinkedList mySingleLinkedList=new MySingleLinkedList();
       mySingleLinkedList.add(0,"a");
       mySingleLinkedList.add(1,"b");
        mySingleLinkedList.add(2,"c");
       System.out.println(mySingleLinkedList.get(1));
       mySingleLinkedList.add(1,"d");
        System.out.println(mySingleLinkedList.get(1));
       System.out.println(mySingleLinkedList.length());*/

       /*-----------------------------Test--调用双链表--------------------------------------*/

       /*MyDoubleLinkedList myDoubleLinkedList=new MyDoubleLinkedList();
       myDoubleLinkedList.add(0,"a");
       myDoubleLinkedList.add(1,"b");
       System.out.println(myDoubleLinkedList.get(0));
       myDoubleLinkedList.add(2,"c");
       System.out.println(myDoubleLinkedList.get(2));
       myDoubleLinkedList.set(1,"d");
       System.out.println(myDoubleLinkedList.get(1));*/

       /*----------------------------------Test--排序-----------------------------------------*/
       /*int[] arrs={7,9,1,37,21,29,39};
        System.out.println(Arrays.toString(arrs));
       MySort mySort=new MySort(arrs);
       mySort.qSort(0,arrs.length-1);
       System.out.println("插入排序"+Arrays.toString(arrs));*/

       /*----------------------------------Test--逆序------------------------------------------*/
       /*int[] ints={3,5,9,2,10,8};
        System.out.println(Arrays.toString(ints));
       Reserve reserve=new Reserve(ints);
       reserve.reserve();
       System.out.println(Arrays.toString(ints));*/

       /*---------------------------------------Test--二分法查找----------------------------------*/
       /*  int[] ints={3,5,8,9,0,2,7,44,6};
        BinarySearch binarySearch=new BinarySearch(ints);
       int i= binarySearch.indexofByWhie(0,ints.length-1,1);
       System.out.println(i);*/

       /*------------------------------------------Test---查找字符串---------------------------------*/
        /*FindString findString=new FindString("AAABBBccccddd2222333dddddd4ee");
        findString.findMostStr();*/

        /*---------------------------------------Test---递归阶乘----------------------------------------*/
         /*  Factorial factorial=new Factorial();
        System.out.println(factorial.factoial(3));
        System.out.println(factorial.factoial(1));*/


        /*--------------------------------------TEST-策略模式-------------------------------------------*/
        /*List<Apple>  appleList=new ArrayList<>();
        appleList.add(new Apple(120,"green"));
        appleList.add(new Apple(150,"green"));
        appleList.add(new Apple(130,"red"));
        appleList.add(new Apple(160,"blue"));
        filterApple(appleList,new WeightPredicate());
        //Lambda表达式简化写法
        filterApple(appleList,apple ->apple.getWeight()>150);*/

        /*---------------------------------------Test-装饰器模式-----------------------------------------------*/
       /* Persion xiaoyang=new XiaoYang();
        xiaoyang=new Hat(xiaoyang);
        xiaoyang=new Jack(xiaoyang);
        xiaoyang.cost();
        xiaoyang.show();;*/

       /*---------------------------------------Test-观察者模式---------------------------------------------*/
      /*  ISubject subject=new Observerable();
        Observer observerA=new ObserverA();
        Observer observerB=new ObserverB();
        subject.registerObserver(observerA);
        subject.registerObserver(observerB);
        subject.notifyObserver();*/

       /*---------------------------------------TEST- BIO socket通信--------------------------------------------*/
        //BIOSocketServer.initSocketServer();

        /*--------------------------------TEST- NIO socket通信---------------------------------------------*/
        /*NIOSocketServer nioServer=new NIOSocketServer();
        nioServer.start();
        connectNioScocket();*/
        /*--------------------------------TEST---LinkHashMap---------------------------------------------*/
        //testLinkHashMap();

        /*----------------------------------Test-信号量-------------------------------  -----------------*/
        //testSemaphore();

        /*----------------------------------Test-CountDownLatch-------------------------------  -----------------*/
        testCountDown();
    }

    //Test-Concurrent——Countdown
    static void testCountDown(){
        for (int i=0;i<4;i++){
            Thread firstCountDownWork=new Thread(new FirstCountDownWork(new CountDownLatch(3)));
            firstCountDownWork.start();
        }
    }

    //Test-Concurrent——synchronized
    static void testConcurrent(){
        TicketThread ticketThread=new TicketThread();
        Thread ticketThread1=new Thread(ticketThread);
        Thread ticketThread2=new Thread(ticketThread);
        ticketThread1.start();
        ticketThread2.start();
    }

    //Test-Concurrent——SemaphoreWork
    static void testSemaphore(){
        Semaphore semaphor=new Semaphore(6);
        for (int i=0;i<10;i++){
            Thread semaphoreWorkThread=new Thread(new SemaphoreWork(semaphor));
            semaphoreWorkThread.start();
        }
    }

    //Nio连接
     static void connectNioScocket(){
         try {
             Socket socket=new Socket(InetAddress.getLocalHost(),8999);
             BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
             bufferedReader.lines().forEach(s -> {System.out.println(s);});
         } catch (IOException e) {
             e.printStackTrace();
         }
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

    //Test-测试HashMap
    static void testLinkHashMap(){
        LinkedHashMap<String,String> linkedHashMap=new LinkedHashMap(){
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size()>3;
            }
        };

       /* linkedHashMap.put("p1","www");
        linkedHashMap.put("p2","bbb");
        linkedHashMap.put("p3","ccc");
        linkedHashMap.forEach((k,v) -> {
            System.out.println(k+":"+v);
        });

        linkedHashMap.get("p1");
        linkedHashMap.get("p1");
        linkedHashMap.get("p3");
        System.out.println("Test2");
        linkedHashMap.forEach((k,v)->{
            System.out.println(k+":"+v);
        });

        linkedHashMap.put("p4","ddddd");
        System.out.println("Test3");
        linkedHashMap.forEach((k,v)->{
            System.out.println(k+":"+v);
        });*/

    }

}
