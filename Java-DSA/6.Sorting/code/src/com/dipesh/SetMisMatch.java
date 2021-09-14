package com.dipesh;

import java.util.Arrays;

// https://leetcode.com/problems/set-mismatch/
public class SetMisMatch {
    public static void main(String[] args) {
        int[] a = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(a)));
    }
    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i<nums.length){
             int correctIndex = nums[i] - 1;
             if(nums[i] != nums[correctIndex]){
                 swap(nums,i,correctIndex);
             }
             else {
                i++;
             }
        }
        System.out.println(Arrays.toString(nums));

        for (int index = 0; index < nums.length;index++){
            if(index+1 != nums[index]){
//              [Duplicate,Missing]
                return new int[]{ nums[index], index+1 };
            }
        }
        return new int[] {-1,-1};
    }

    static void swap(int[] a, int first, int second) {
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }
}
