package com.dipesh;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {-34,-1,0,12,-13};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selection(int[] a) {
        for (int i = 0;i< a.length;i++){
            // find the max item in the remaining array and swap with correct index
            int lastIndex = a.length - 1 -i;
            int maxIndex = getMax(a,0,lastIndex);
            swap(a,maxIndex,lastIndex);
        }
    }

    private static void swap(int[] a, int first, int second) {
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }

    private static int getMax(int[] a, int start, int end) {
        int maxIndex = start;
        for (int i = start;i<=end;i++){
            if(a[maxIndex] < a[i]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
