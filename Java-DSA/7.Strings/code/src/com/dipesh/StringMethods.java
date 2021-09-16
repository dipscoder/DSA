package com.dipesh;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Dipesh Jaiswal Yoo Mann";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('e'));
        System.out.println("     Dipesh   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
