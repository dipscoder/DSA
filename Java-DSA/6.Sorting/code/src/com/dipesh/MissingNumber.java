package com.dipesh;

import java.util.Arrays;

//https://leetcode.com/problems/missing-number/
class MissingNumber {
    public static void main(String[] args) {
//        int[] nums = {9,6,4,2,3,5,7,0,1};
//       Case 2
        int[] nums = {0,1};
        System.out.println(missingNumber(nums));
    }
    static public int missingNumber(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i];
            if(nums[i] >= nums.length){
                // ignore Nth element(last element)
                i++;
            }
            else if(nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else{ 
                i++;
            }
        }

//      Search for missing number
        for(int j=0;j<nums.length;j++){
            if(j != nums[j]){
                return j;
            }
        }
//      Case 2 - nums=>[0,1,2,3], here the missing number is N(length of array)
        return nums.length;
    }
    
    static void swap(int[] a, int first, int second) {
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }
}