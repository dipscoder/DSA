package com.dipesh;

public class FindMin {
    public static void main(String[] args) {
        int[] a = {23,72,2323,12,13,4,-25,65,88,96};
        System.out.println(min(a));
    }

    static int min(int[] arr){
        int ans = arr[0];

        for (int i=0;i<arr.length;i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
