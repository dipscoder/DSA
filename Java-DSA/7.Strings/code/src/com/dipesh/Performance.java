package com.dipesh;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i<26;i++){
            char ch = (char) ('a' + i);
//          Here with each iteration a new object is created
//          Ex:- "abc" + "d" will create a new object "abcd" and because of old objects will get dereference
//          Problem:- Wastage of space and O(n2) complexity
//          Solution:- Use StringBuilder
            series = series + ch;
        }
        System.out.println(series);





    }
}
