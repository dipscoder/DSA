package com.dipesh;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int n = in.nextInt();
        int count = 0;
        while (number > 0) {
//            Last Digit
            int rem = number % 10;
            if(rem == n) {
                count++;
            }
//             Remove last digit
            number = number / 10;
        }
        System.out.println(count);
    }
}
