package com.dipesh.Problems;

import java.util.Arrays;

// https://www.geeksforgeeks.org/sum-triangle-from-array/
public class SumTriangle {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        sumTriangle(a);
    }
    static void sumTriangle(int[] a){

//        Base Case
        if(a.length < 1){
            return;
        }
        int[] temp = new int[a.length-1];

        for (int i = 0;i < a.length-1;i++){
            temp[i] = a[i] + a[i+1];
        }

        sumTriangle(temp);

        System.out.println(Arrays.toString(a));
    }
}
