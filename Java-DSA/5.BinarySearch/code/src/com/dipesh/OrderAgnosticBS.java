package com.dipesh;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] a = {12,34,35,56,78,79,99,110,123,456};
        int[] a = {99,85,76,45,34,23,15,12,1,0,-2,-99};
        int target = -99;
        System.out.println(orderAgnosticBS(a,target));
    }

    static int orderAgnosticBS(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
//        Order Agnostic means we have given a SORTED array, but we don't know if its ascending or descending.
        boolean isAcs = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end-start) / 2;

            if(arr[mid] == target) return mid;
//            Ascending
            else if(isAcs){
                if(arr[mid] > target) end = mid - 1;
                else start = mid + 1;
            }
//            Descending
            else{
                if(arr[mid] > target) start = mid + 1;
                else end = mid - 1;
            }

        }
        return -1;
    }
}
