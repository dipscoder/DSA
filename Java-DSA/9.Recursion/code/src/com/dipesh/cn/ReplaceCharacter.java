package com.dipesh.cn;

public class ReplaceCharacter {
    public static void main(String[] args) {
        String s = "abxsasxasrxayx";
        System.out.println(replaceChar(s,'a','c'));
    }

    public static String replaceChar(String str, char org, char rep){
//        Base Case
        if(str.length() == 0){
            return str;
        }
//      Induction Hypothesis
        String smallOutput = replaceChar(str.substring(1),org,rep);

//      Induction Step
        if(str.charAt(0) == org){
//          Append with new character
            return rep + smallOutput;
        }
        else {
//          Append with current character
            return str.charAt(0) + smallOutput;
        }

    }

}
