package com.dipesh;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Dipesh";
        char target = 'p';
        System.out.println(search(name,target));
        System.out.println(search2(name,target));

        System.out.println(Arrays.toString(name.toCharArray()));
    }


    static boolean search2(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }

    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for (int i =0; i<str.length();i++){
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}
