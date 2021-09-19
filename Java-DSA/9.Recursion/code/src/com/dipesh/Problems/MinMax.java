package com.dipesh.Problems;
//https://www.geeksforgeeks.org/program-find-minimum-maximum-element-array/
import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int[] a = { 12, 1234, 45, 67, 1 };
        System.out.println(Arrays.toString(minmax(a,0,a[0],a[0])));
    }

    static int[] minmax(int[] a, int i,int min,int max){

        if(i == a.length){
            return new int[] {min,max};
        }

        if(a[i] > max){
            max = a[i];
        }
        if(a[i] < min){
            min = a[i];
        }
        return minmax(a,i+1,min,max);
    }
}
