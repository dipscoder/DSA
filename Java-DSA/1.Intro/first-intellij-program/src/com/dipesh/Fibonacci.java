package com.dipesh;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
//        int c = 0;
//        for (int i = 2; i<=n; i++){
//            c = a + b;
//            a = b;
//            b = c;
//        }

//        With while loop
        int count = 2;
        while (count <= n) {
            int temp = a+b;
            a = b;
            b = temp;
            count++;
        }
        System.out.println(b);


    }
}
