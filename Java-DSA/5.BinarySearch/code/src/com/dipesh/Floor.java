package com.dipesh;

public class Floor {

    public static void main(String[] args) {
	// write your code here
        int[] a = {12,34,35,56,78,79,99,110,123,456};
        int target = 11;
        System.out.println(floor(a,target));
    }

    //    return index of the greatest number which is <= target
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
//            int mid = (int) Math.floor( (double) ((start+end)/2));
//          Better way to find middle
//            int a = 5/2; => gives 2
            int mid = start + (end-start) / 2;

            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return end;
    }

}


