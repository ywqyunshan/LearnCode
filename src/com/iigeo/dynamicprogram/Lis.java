package com.iigeo.dynamicprogram;

/**
 * 最长递增子序列
 */
public class Lis {

    private static final Lis sLis=new Lis();
    private Lis(){};
    //静态工厂模式
    public static Lis getInstance(){
        return sLis;
    }

    private int[] arrs;
    public Lis(int[] arrs){
        this.arrs=arrs;
    }

    public int getLisLength(){
        if (arrs==null||arrs.length==0) return 0;
        int size=arrs.length;
        int maxCount=0;
        ///存储每个位置的最长子序列个数；
        int[] dp=new int[size];
        for (int i=0;i<size;i++){
            dp[i]=1;
            for (int j=0;j<i;j++){
                if (arrs[i]>arrs[j]){
                    dp[i]=dp[i]>dp[j]+1?dp[i]:dp[j]+1;
                }
                if (maxCount<dp[i])
                    maxCount=dp[i];
            }
        }
        return maxCount;
    }

}
