package com.fancy.tmall.test.arithmetic.base;

import java.util.Arrays;

/**
 * Created by lihaibin02 on 2016/9/13.
 */
/*
* 给定一个存放整数的数组，重新排列数组使得数组左边为奇数，右边为偶数。
  要求：，时间复杂度为O（n）。
* */
//空间复杂度O(1)
public class ArrayMinMaxSort {
    /*
     解决思路：数组左边left，右边right。左边遇到第一个偶数停止，右边遇到第一个奇数停止。二者进行交换
     知道left>right操作结束
    * */
    public static  int[] function_Application(int arr[]){
        int left=0;
        int right=arr.length-1;
        int flag;
        while (left<right){
            if(arr[left]%2==0){
                left++;
                continue;
            }
            if(arr[right]%2!=0){
                right--;
                continue;
            }
            if(left<right){
                flag=arr[left];
                arr[left++]=arr[right];
                arr[right--]=flag;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={3,2,5,8,39,40,43,123,98,50};
        System.out.println(Arrays.toString(function_Application(arr)));
    }
}
