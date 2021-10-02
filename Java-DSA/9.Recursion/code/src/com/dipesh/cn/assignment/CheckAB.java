package com.dipesh.cn.assignment;

public class CheckAB {
    public static void main(String[] args) {
        System.out.println(checkAB("abbbabaaa")); // output must be - false
    }

    public static boolean checkAB(String input) {
        // Write your code here
// 		Base Case
        if(input.length() <= 0) {
            return true;
        }

        if(input.charAt(0) == 'a'){
            if(input.substring(1).length() > 1 && input.substring(1,3).equals("bb")){
//              Means there is "bb" after "a", now check the remaining string
                return checkAB(input.substring(3));
            }
            else {
//              Means there is no "bb" after a so check for "a" or ""
                return checkAB(input.substring(1));
            }
        }

//      Return false if non of the above condition is met.
        return false;
    }
}
