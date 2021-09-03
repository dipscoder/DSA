package com.dipesh;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] a = {
                {12,45,23},
                {23,5,31,-3},
                {32,56,90},
                {35,75}
        };
        int target = 56;
        System.out.println(Arrays.toString(search(a, target)));
        System.out.println(max(a));
        System.out.println(Integer.MIN_VALUE+" "+Integer.MAX_VALUE);
    }

    static int[] search(int[][] arr, int target){
        for (int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col] == target){
//                    int[] a = {row,col};
//                    return a;
                    // Or
                    return new int[] {row,col};
                }
            }
        }
        int[] ans = {-1};
        return ans;
    }

    static int max(int[][] arr){
        int ans = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > ans) {
                    ans = element;
                }
            }
        }
        return ans;
    }
}
