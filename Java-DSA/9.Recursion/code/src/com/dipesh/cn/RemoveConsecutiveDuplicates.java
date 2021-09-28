package com.dipesh.cn;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        String input = "CCooddiinnggNNiinnnnjjjjaaaassss";
        System.out.println(removeConsecutiveDuplicates(input));
        System.out.println(removeConsecutiveDuplicates2(input));
    }

    // My selected solution
    public static String removeConsecutiveDuplicates(String s) {
        // Write your code here
        if(s.length() <= 1){
            return s;
        }

        if(s.charAt(0) == s.charAt(1)){
            String smallOutput = removeConsecutiveDuplicates(s.substring(2));

//          Edge case - 'b' + (smallOutput = 'basd') -> 'bb'asd
            if( smallOutput.length() != 0 && s.charAt(0) == smallOutput.charAt(0) ){
                return smallOutput; // return 'basd'
            }
            else {
                return s.charAt(1) + smallOutput;
            }
        }
        else {
//           Edge case - 'ab'basdass
            String smallOutput = removeConsecutiveDuplicates(s.substring(1));

//          Edge case - 'b' + (smallOutput = 'basd') -> 'bb'asd
            if( smallOutput.length() != 0 && s.charAt(0) == smallOutput.charAt(0) ){
                return smallOutput; // return 'basd'
            }
            else {
                return s.charAt(0) + smallOutput;
            }
        }
    }

    // Their solution - same idea but in better way
    public static String removeConsecutiveDuplicates2(String s) {
        if (s.length() <= 1) {
            return s;
        }
        if (s.charAt(0) == s.charAt(1)) {
            return removeConsecutiveDuplicates(s.substring(1));
        } else {
            String small = removeConsecutiveDuplicates(s.substring(1));
            return s.charAt(0) + small;
        }
    }



}
