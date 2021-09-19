package com.dipesh.Problems;
//https://www.geeksforgeeks.org/program-for-length-of-a-string-using-recursion/
public class LengthOfString {
    public static void main(String[] args) {
        String str ="GeeksforGeeks";
        System.out.println(str.substring(1));
        System.out.println(length(str));
    }
    static int length(String str){
        if(str.equals("")){
            return 0;
        }

        return 1 + length(str.substring(1));
    }
}
