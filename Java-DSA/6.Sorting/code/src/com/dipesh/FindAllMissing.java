package com.dipesh;
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
import java.util.ArrayList;
import java.util.List;

public class FindAllMissing {
    public static void main(String[] args) {
        int[] a = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(a));
    }

    static public List<Integer> findDisappearedNumbers(int[] nums) {
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
//        System.out.println(Arrays.toString(nums));
//      Search for missing numbers
        List<Integer> list = new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(j != nums[j]-1){
                list.add(j+1);
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
