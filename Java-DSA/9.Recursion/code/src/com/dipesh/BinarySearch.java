package com.dipesh;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1,2,4,5,67,99,232};
        int target = 67;
        System.out.println(bs(a,target,0,a.length-1));
    }

    static int bs(int[] arr,int target,int start, int end){
//      Base Case
        if(start > end){
            return -1;
        }
//      Comparisons
        int mid = start + (end-start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] < target){
//          Check on Right
            return bs(arr,target,mid+1,end);
        }
        // Check on Left
        return bs(arr,target,start,mid-1);
    }
}
