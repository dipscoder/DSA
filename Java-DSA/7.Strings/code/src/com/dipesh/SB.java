package com.dipesh;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i<26;i++){
            char ch = (char) ('a' + i);
//          SB are Mutable means we can change its value
//          Due to this, here we are not creating new objects everytime
//          Instead just modifying the values
//          Complexity is O(n)
            builder.append(ch);
        }
        System.out.println(builder);
    }
}
