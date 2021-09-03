package com.dipesh;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {23,72,2323,12,13,4,-25,65,-88,96};
        int target = 125;
        int ans = linearSearch(a,target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for (int i=0; i< arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }
}
