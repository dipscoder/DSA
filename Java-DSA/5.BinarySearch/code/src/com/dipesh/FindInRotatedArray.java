package com.dipesh;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class FindInRotatedArray {
    public static void main(String[] args) {
        int[] a = {4,5,6,7,0,1,2};
        int[] b = {3,5,1};
        int target = 3;
        System.out.println(search(b,target));
    }

    static int search(int[] nums, int target){
//        Find pivotIndex
        int pivotIndex = findPivot(nums);

        // if you did not find a pivotIndex, it means the array is not rotated
        if (pivotIndex == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0 , nums.length - 1);
        }
        if(nums[pivotIndex] == target){
            return pivotIndex;
        }
        if(target >= nums[0]){
            return binarySearch(nums,target,0,pivotIndex-1);
        }

        return binarySearch(nums, target, pivotIndex + 1, nums.length - 1);

    }


    static int binarySearch(int[] arr, int target,int start,int end){

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


    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(mid > start && arr[mid] < arr[mid-1]){
                return mid - 1;
            }
//            Pivot lies on the left-hand side and mid is currently in section 2
            else if(arr[start] >= arr[mid]){
                end = mid - 1;
            }
//            Pivot lies on the right-hand side and mid is currently in section1
//            arr[start] < arr[mid]
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
