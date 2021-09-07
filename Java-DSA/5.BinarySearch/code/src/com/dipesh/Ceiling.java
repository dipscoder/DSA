package com.dipesh;

public class Ceiling {

    public static void main(String[] args) {
	// write your code here
        int[] a = {12,34,35,56,78,79,99,110,123,456};
        int target = 459;
        System.out.println(ceiling(a,target));
    }

//    return index of the smallest number which <= target
    static int ceiling(int[] arr, int target){
//        if target is larger than the largest number in the array
        if(target > arr[arr.length - 1]){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while(start <= end){

            int mid = start + (end-start) / 2;

            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return start;
    }

}


