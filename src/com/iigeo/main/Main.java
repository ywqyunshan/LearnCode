package com.iigeo.main;

import com.iigeo.base.Reserve;
import com.iigeo.datastrut.MyArraryList;
import com.iigeo.datastrut.MyLinkedStack;
import com.iigeo.find.BinarySearch;
import com.iigeo.find.FindString;
import com.iigeo.sort.MySort;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) {

        //调用顺序列表
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

        //调用栈
       /*MyLinkedStack myArraryStack=new MyLinkedStack();
       myArraryStack.push("a");
       myArraryStack.push("b");
       myArraryStack.push("c");
       System.out.println(myArraryStack.pop());
       System.out.println(myArraryStack.peek());
       System.out.println(myArraryStack.pop());
*/
      //调用单链表
      /* MySingleLinkedList mySingleLinkedList=new MySingleLinkedList();
       mySingleLinkedList.add(0,"a");
       mySingleLinkedList.add(1,"b");
        mySingleLinkedList.add(2,"c");
       System.out.println(mySingleLinkedList.get(1));
       mySingleLinkedList.add(1,"d");
        System.out.println(mySingleLinkedList.get(1));
       System.out.println(mySingleLinkedList.length());*/

      //调用双链表
       /*MyDoubleLinkedList myDoubleLinkedList=new MyDoubleLinkedList();
       myDoubleLinkedList.add(0,"a");
       myDoubleLinkedList.add(1,"b");
       System.out.println(myDoubleLinkedList.get(0));
       myDoubleLinkedList.add(2,"c");
       System.out.println(myDoubleLinkedList.get(2));
       myDoubleLinkedList.set(1,"d");
       System.out.println(myDoubleLinkedList.get(1));*/

       //排序
       /*int[] arrs={7,9,1,37,21,29,39};
        System.out.println(Arrays.toString(arrs));
       MySort mySort=new MySort(arrs);
       mySort.qSort(0,arrs.length-1);
       System.out.println("插入排序"+Arrays.toString(arrs));*/

       //逆序
       /*int[] ints={3,5,9,2,10,8};
        System.out.println(Arrays.toString(ints));
       Reserve reserve=new Reserve(ints);
       reserve.reserve();
       System.out.println(Arrays.toString(ints));*/

       //二分法查找
      /*  int[] ints={3,5,8,9,0,2,7,44,6};
        BinarySearch binarySearch=new BinarySearch(ints);
       int i= binarySearch.indexofByWhie(0,ints.length-1,1);
       System.out.println(i);*/

        FindString findString=new FindString("AAABBBccccddd2222333dddddd4ee");
        findString.findMostStr();


    }

}
