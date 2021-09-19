package com.dipesh.Problems;
//https://leetcode.com/problems/power-of-two/
public class IsPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(14));
    }
    static public boolean isPowerOfTwo(int n) {
        return n > 0 && (n == 1 || (n%2 == 0 && isPowerOfTwo(n/2)));
    }
}
