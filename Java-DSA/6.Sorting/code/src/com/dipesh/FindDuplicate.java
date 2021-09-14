package com.dipesh;
//https://leetcode.com/problems/find-the-duplicate-number/submissions/
public class FindDuplicate {
//  Method 1 - 7 ms
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
//          Check if the number at index i is correct value or not (means == i+1 or not)
            if(nums[i] != i+1){
                int correctIndex = nums[i] - 1;
//              Check if the value at the correct index is not equal to the current index i, TRUE then swap
                if(nums[i] != nums[correctIndex]){
                    swap(nums,i,correctIndex);
                }
//              if they are equal then directly that number as it the duplicate number
                else{
                    return nums[i];
                }
            } else{
                i++;
            }

        }

        return -1;
    }

//  Method 2 - 10 ms
    public int findDuplicate2(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correctIndex = nums[i] - 1;

            if(nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else{
                i++;
            }
        }
//      Duplicate will be at the last position so return that number
        return nums[nums.length-1];
    }

    void swap(int[] a, int first, int second) {
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }
}
