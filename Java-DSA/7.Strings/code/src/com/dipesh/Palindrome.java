package com.dipesh;

public class Palindrome {
    public static void main(String[] args) {
        String a = "abcdcba";
        System.out.println(palindrome(a));
    }

    private static boolean palindrome(String a) {
        if(a.length() == 0)
            return true;
        int start = 0;
        int end = a.length()-1;

        while (start <= end){
            char i = a.charAt(start);
            char j = a.charAt(end);
            if(i == j){
                start++;
                end--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
