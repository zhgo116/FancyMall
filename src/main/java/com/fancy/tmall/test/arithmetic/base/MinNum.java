package com.fancy.tmall.test.arithmetic.base;

/**
 * 求最小数
 * @author caosheng
 * @date 2019/01/04
 */
public class MinNum {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{2,3,4,5,6},{1234,5,6,7,7,8,8,8,8,8,8,8,8,8,},{1,2}};
        int min=a[0].length;
       int mini=0;
        for (int c[] :a){
            int cd=c.length;
            if (cd<min){
                mini=cd;
            }
        }
        System.out.println(mini);

    }
}
