package com.dipesh;
// https://leetcode.com/problems/find-all-duplicates-in-an-array/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicate {
    public static void main(String[] args) {
        int[] a = {4,3,2,7,8,2,3,1};
        System.out.println(findAllDuplicate2(a));
    }

// Method 1 - 38 ms
    static public List<Integer> findAllDuplicate(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i] - 1;

            if(nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
//      Search for missing numbers
        List<Integer> list = new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(j != nums[j]-1){
                list.add(nums[j]);
            }
        }
        return list;
    }

//  Method 2 - Time Limit Exceeded
    static public List<Integer> findAllDuplicate2(int[] nums) {
        int i = 0;
        List<Integer> list = new ArrayList<>();
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
                    list.add(nums[i]);
                }
            } else{
                i++;
            }

        }
        return list;
    }
    static void swap(int[] a, int first, int second) {
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }
}
