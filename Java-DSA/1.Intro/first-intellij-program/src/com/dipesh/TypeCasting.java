package com.dipesh;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        float n = input.nextFloat();
//        int n = (int) 565.646;
//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a * b) / c;

//        Type Promotion
        byte b= 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b) + (i/c) - (d*s);
//        float + int - double = double
        System.out.println((f*b) +" "+ (i/c) +" " + (d*s));
        System.out.println(result);
    }
}
