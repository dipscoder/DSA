package com.dipesh.Arrays;

import java.util.Arrays;

public class MinAndMax {
    public static void main(String[] args) {
        int[] a = {1000, 11, 445, 1, 330, 3000};
//        Method1 Linear Search
        System.out.println(Arrays.toString(linearMinMax(a)));

//        Method2 Tournament Method (Recursive Approach)
//        System.out.println(tournamentMinMax(a));

    }

//    private static int[] tournamentMinMax(int[] a) {
////      Divide the array into two parts and compare the maximums and minimums of the two parts to get the maximum and the minimum of the whole array.
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//
////          Base Case
//        if(a.length == 1) {
//            min = a[0];
//            max = a[0];
//        }
//        else if(a.length == 2)
//            if(a[0] > a[1]){
//                min = a[1];
//                max = a[0];
//            }
//            else{
//                min = a[0];
//                max = a[1];
//            }
//
//
//
//    }

    private static int[] linearMinMax(int[] a) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i=0;i<a.length;i++){
            if(a[i] > max)
                max = a[i];
            if(a[i] < min)
                min = a[i];
        }
        return new int[] {min,max};
    }

}
