package com.dipesh;

public class Fibonacci {
    public static void main(String[] args) {
        int ans = fibo(4);
        System.out.println(ans);
    }

    //  Not an efficient solution as recursion tree is repeated which can be solved by dynamic programing
    //  Check with n = 50, it will take too long to answer
    static int fibo(int n) {
        //Base case
        if (n < 2) {
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }
}
