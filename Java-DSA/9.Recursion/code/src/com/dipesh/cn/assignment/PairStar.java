package com.dipesh.cn.assignment;

public class PairStar {
    public static void main(String[] args) {
        System.out.println(addStars("scatter"));
    }

    public static String addStars(String s) {
        // Write your code here
// 		Base case
        if(s.length() <= 1){
            return s;
        }

//         Not working at the time of submission
//         String smallOutput = addStars(s.substring(2));

//         if(s.charAt(0) == s.charAt(1)){
//             return s.charAt(0) + "*" + s.charAt(1) + smallOutput;
//         }
//         else if(s.charAt(1) == smallOutput.charAt(0)){
//             return s.substring(0,2) + "*" + smallOutput;
//         }
//         else {
//             return s.substring(0,2) + smallOutput;
//         }


//      working and actually better
        String smallOutput = addStars(s.substring(1));

        if(s.charAt(0) == smallOutput.charAt(0)){
            return s.charAt(0) + "*" + smallOutput;
        }
        else {
            return s.charAt(0) + smallOutput;
        }
    }
}
