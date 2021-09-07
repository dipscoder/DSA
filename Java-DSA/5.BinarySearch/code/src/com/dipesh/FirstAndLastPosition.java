package com.dipesh;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,3,3,3,5,5,7};
        int target = 9;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1,-1};
        ans[0] = search(nums,target,true);
        if(ans[0] != -1)
            ans[1] = search(nums,target,false);

        return ans;
    }

    static int search(int[] nums,int target, boolean findFirstIndex){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) /2;

            if(target == nums[mid]){
//                 Potential Answer
                ans = mid;
                if(findFirstIndex){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else if(target < nums[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return ans;
    }
}
