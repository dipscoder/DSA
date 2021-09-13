package com.dipesh;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a={5,4,3,2,1,0};
        insertion(a);
        System.out.println(Arrays.toString(a));
    }

    private static void insertion(int[] a) {
//      i will run till length-2
        for (int i=0; i < a.length-1;i++){
            for (int j=i+1;j>0;j--){
//              Check on the left side, if previous element(j-1) is less than current element(j) then no need to check for other previous(j-2) elements, as they are already sorted
                if(a[j-1] <= a[j]){
                    break;
                }
                swap(a,j,j-1);
            }
        }
    }

    private static void swap(int[] a, int first, int second) {
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }
}
