package com.itheima.interview;

public class BainarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int left;
        int right;
        int middle;
        left=0;
        right=arr.length-1;

    }
    public int me(int[] arr,int left,int right,int findvalue){
        if (right>left){
            return -1;
        }
        int middle=(left+right)/2;
        if (findvalue>arr[middle]){
            me(arr,middle,right,findvalue);
        }else if (findvalue<arr[middle]){
            me(arr,left,middle,findvalue);
        }else if (findvalue==arr[middle]){
            return 1;
        }
        return -1;
    }
}
