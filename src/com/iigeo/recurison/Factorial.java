package com.iigeo.recurison;

/**
 * 递归-阶乘
 */
public class Factorial {

    public int factoial(int n){
        if (n<=1) return 1;
        else {
            int subsum=factoial(n-1);
            subsum=n*subsum;
            return subsum;
        }
    }
}
