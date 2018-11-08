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
     * 冒泡排序，稳定算法
     */
    public void bubbleSort(){
        for (int i=0;i<arrs.length;i++){
            boolean isFag=true;
            for (int j=0;j<arrs.length-1-i;j++){
                if (arrs[j]>arrs[j+1]){
                    int temp=arrs[j];
                    arrs[j]=arrs[j+1];
                    arrs[j+1]=temp;
                    isFag=false;
                }
            }
            //如果本次排序没有比较，则直接退出
            if (isFag)break;
        }
    }

    /**
     * 插入排序
     */
    public void  insertSort(){
        for(int i=1;i<arrs.length;i++){
            //取出无序区数据
            int value=arrs[i];
            //标记有序区节点位置
            int j=i-1;
            //将无序区数据和有序区数据比对时，从右往左比对
         /*   while (j>=0&&value<arrs[j]){
                arrs[j+1]=arrs[j];
                j--;
            }
            arrs[j+1]=value;*/
            for (;j>=0;j--){
                if (value>=arrs[j])break;
                arrs[j+1]=arrs[j];
            }
            arrs[j+1]=value;
        }

    }

    public void quickSort(int left,int right){
        if (left >= right || arrs == null || arrs.length <= 1) {
            return;
        }
        //获取分区值(下标为0的值)）
        int value=arrs[(left+right)/2];
        int i=left;
        int j=right;

        while (j>=i){
            //从右侧查找大于value的值，右侧索引移动
            while (arrs[j]>value)j--;
            //从左侧查找小于value的值，左侧索引移动
            while (arrs[i]<value)i++;

            if (j>i){
               int temp=arrs[i];
               arrs[i]=arrs[j];
               arrs[j]=temp;
               i++;
               j--;
             }else if (i==j){
                i++;
            }
        }
        quickSort(left,j);
        quickSort(i,right);
    }

    /**
     * 二分插入排序
     */
    public void binaryInsertSort(){

    }

    /**
     * 选择排序，时间复杂度O(n²)，不稳定
     */
    public void selectSort(){
        int min;
        for (int i=0;i<arrs.length-1;i++){
            min=i; //最小值的下标赋值为初始i值
            for(int j=i+1;j<arrs.length-1;j++){
                if (arrs[min]>arrs[j]) min=j;
            }
            int temp=arrs[i];
            arrs[i]=arrs[min];
            arrs[min]=temp;

        }
    }



    /**
     * 快速排序，算法复杂度O(n log n)，不稳定 ，空间复杂度O(1),采用分治和递归思想
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
