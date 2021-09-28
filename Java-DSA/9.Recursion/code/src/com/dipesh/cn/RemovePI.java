package com.dipesh.cn;

public class RemovePI {
    public static void main(String[] args) {
//        String s = "abspiaseppipp";
        String s = "piapipippiaappi";
//        String s = "abdaeappai";
        System.out.println(removePI(s));
        System.out.println(removePI2(s));
    }

    public static String removePI(String str){
//      Base Case
        if(str.length() <= 1){
            return str;
        }

        String smallOutput = removePI(str.substring(1));

        if(str.substring(0, 2).equals("pi")){
            return "3.14" + smallOutput.substring(1);
        }
        else {
//          ppiasdas
            String output = removePI(str.substring(1));
            return str.charAt(0) + output;
        }
    }

//  Same Idea but in a better way
    public static String removePI2(String str){
//      Base Case
        if(str.length() <= 1){
            return str;
        }

        if(str.substring(0, 2).equals("pi")){
//          Ignore first two character and search on other part
            String smallOutput = removePI(str.substring(2));
            return "3.14" + smallOutput;
        }
        else {
//          Edge case - ppiasdas
//          Ignore only first character and search on other part
            String smallOutput = removePI(str.substring(1));
//          Append the first character with the result
            return str.charAt(0) + smallOutput;
        }
    }
}
