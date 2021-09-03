package com.dipesh;

public class SearchInRange {
    public static void main(String[] args) {
        int[] a = {23,72,2323,12,13,4,-25,65,-88,96};
        int target = 232;

        System.out.println(search(a,target,1,5));
    }

    static int search(int[] arr, int target,int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for (int i =start; i<=end;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
