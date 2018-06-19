package com.iigeo.sort;

public class MySort {

    private int[] arrs;

    public MySort(int[] arrs){
        this.arrs=arrs;
    }

    void swap(int left ,int right){
        int temp=right;
        right=left;
        left=temp;
    }

    /**
     * 冒泡排序
     */
    public void bubbleSort(){
        for (int i=0;i<arrs.length-1;i++) {
            //共有n-1趟排序
            boolean isFlag=true;
            for (int j = 0; j < arrs.length - 1-i; j++) {
                if (arrs[j] > arrs[j+1]) {
                    int temp=arrs[j];
                    arrs[j]=arrs[j+1];
                    arrs[j+1]=temp;
                    isFlag=false;
                }
            }
            //如发现某趟无交换，表示已经排好序，直接退出循环。
            if (isFlag)break;
        }
    }

    /**
     * 直接插入排序
     */
    public void insertSort(){

        for (int i=0;i<arrs.length-1;i++){
            for (int j=i+1;j>0;j--){
                if (arrs[j-1]<=arrs[j]){
                    break;
                }
                int temp=arrs[j-1];
                arrs[j-1]=arrs[j];
                arrs[j]=temp;
            }

        }

    }

    /**
     * 快速排序
     */
    public void qSort(int left ,int right){
        if (left >= right || arrs == null || arrs.length <= 1) {
            return;
        }
        int i=left;
        int j=right;
        int p=arrs[(i+j)/2];
        while (i<=j){
            while (arrs[i]<p) i++;
            while (arrs[j]>p) j--;
            if (i<j){
                int temp=arrs[i];
                arrs[i]=arrs[j];
                arrs[j]=temp;
                i++;
                j--;
            }else if (i==j){
                i++;
            }
        }
        qSort(left,j);
        qSort(i,right);
    }



}
