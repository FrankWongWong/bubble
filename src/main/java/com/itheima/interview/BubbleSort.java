package com.itheima.interview;

import org.aspectj.weaver.ast.Var;
import sun.security.util.Length;

import java.security.Principal;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={2,3,6,10,5,1};
        int arrlength = arr.length;
        for (int i=0;i<arrlength-1;i++){
            boolean flag=false;
            for (int j=0;j<arrlength-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    flag=true;
                }
            }
            if (!flag)
                break;
        }
        for (int i=0;i< arrlength;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
