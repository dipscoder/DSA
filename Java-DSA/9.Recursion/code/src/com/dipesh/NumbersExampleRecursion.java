package com.dipesh;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n){
//        Base Case
        if(n == 5){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        // recursive call
        // if you are calling a function again and again, you can treat it as a separate call in the stack

        // this is called tail recursion
        // this is the last function call
        print(n+1);
    }
}
