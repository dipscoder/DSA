package com.dipesh.Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        String[] a = {"h","e","l","l","o"};
        String[] b = new String[a.length];
        for(int i = a.length-1; i>=0 ;i--){
            b[(a.length-1)-i] = a[i];
//            System.out.println((a.length-1)-i+ "=>"+i);
        }
//        System.out.println(Arrays.toString(b));

//        Method 2- Two pointers
        System.out.println(Arrays.toString(reverse(a)));

    }

    private static String[] reverse(String[] a) {
        int start = 0;
        int end = a.length-1;

        while (start < end){
            String temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        return a;
    }
}
