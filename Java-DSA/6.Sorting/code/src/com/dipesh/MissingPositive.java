package com.dipesh;
//https://leetcode.com/problems/first-missing-positive/
public class MissingPositive {

    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i] - 1;
            if( nums[i] <= 0 || nums[i] > nums.length){
                // ignore element greater than length and negative numbers & 0
                i++;
            }
            else if(nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else{
                i++;
            }
        }

//      Search for smallest missing positive number
        for(int j=0;j<nums.length;j++){
            if(j + 1 != nums[j]){
                return j+1;
            }
        }
//      Case 2 - nums=>[0,1,2,3], here the smallest missing positive number is N(length of array) + 1
        return nums.length+1;
    }

    static void swap(int[] a, int first, int second) {
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }
}
