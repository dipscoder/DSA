package com.dipesh;
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArray {
    public static void main(String[] args) {
//        Assume an array with infinite length
        int[] a = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(a,target));
    }

    static int ans(int[] arr, int target){
//      If array is infinite we can not use length object
        int start = 0;
        int end = 1;
        int ans = -1;

//      Finding range where target can be found
        while(target > arr[end]){
            int newStart = end + 1;
//          end = end + lengthOfBox * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        ans = search(arr,target,start,end);
        return ans;
    }

    static int search(int[] arr, int target,int start,int end){

        while(start <= end){
//            int mid = (int) Math.floor( (double) ((start+end)/2));
//          Better way to find middle
//            int a = 5/2; => gives 2
            int mid = start + (end-start) / 2;

            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}
