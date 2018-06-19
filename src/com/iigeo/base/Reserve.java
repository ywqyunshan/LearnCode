package com.iigeo.base;

public class Reserve {
    private int[] ints;

    public Reserve(int[] ints){
        this.ints=ints;
    }

    public void reserve(){
        int lenght=ints.length;
        for (int i=0;i<lenght/2;i++){
            int temp=ints[i];
            ints[i]=ints[lenght-1-i];
            ints[lenght-1-i]=temp;
        }
    }
}
