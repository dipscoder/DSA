package com.dipesh;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] a = {5,3,4,2,1};
        cyclic(a);
        System.out.println(Arrays.toString(a));
    }

    static void cyclic(int[] a){
        int i=0;
        while (i<a.length){
            int correctIndex = a[i] - 1;
            if(a[i] != a[correctIndex]){
                swap(a,i,correctIndex);
            } else{
                i++;
            }
        }
    }

    static void swap(int[] a, int first, int second) {
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }
}
