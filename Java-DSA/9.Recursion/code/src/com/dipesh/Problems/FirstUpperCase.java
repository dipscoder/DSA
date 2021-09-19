package com.dipesh.Problems;
//https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/
public class FirstUpperCase {
    public static void main(String[] args) {
        String str = "oollksk";
        System.out.println(upper(str,0));
    }
    static char upper(String str,int i){

        if(i == str.length()-1){
            return ' ';
        }

        if(Character.isUpperCase(str.charAt(i))){
            return str.charAt(i);
        }
        return upper(str,i+1);

    }
}
