package com.dipesh.cn;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = {2,5,3,12,56,1,23,-1,-12,0,8};
        qs(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    public static void swap(int[] a,int first, int second){
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }

    public static int partition(int[] a,int start, int end) {

        int pivotIndex = start;
        int smallNumCount = 0;

        for (int i=start+1;i<=end;i++){
            if(a[i] < a[pivotIndex]){
                smallNumCount++;
            }
        }
        swap(a,pivotIndex,pivotIndex + smallNumCount);
        pivotIndex = pivotIndex+smallNumCount;

//      Transfer small elements on left side of pivot and larger or equal to elements on right side
        int i = start;
        int j = end;

        while (i < pivotIndex && j > pivotIndex){
            if(a[i] < a[pivotIndex]){
                i++;
            }
            else if(a[j] >= a[pivotIndex]){
                j--;
            }
            else {
                swap(a,i,j);
                i++;
                j--;
            }
        }

        return pivotIndex;
    }

    public static void qs(int[] a,int start, int end){
//      Base Case
        if(start >= end){
            return;
        }

        int pivotIndex = partition(a,start,end);

//      First half
        qs(a,start,pivotIndex-1);
//      Second half
        qs(a,pivotIndex+1,end);
    }

}
