package com.dipesh.cn.assignment;
// A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count how many possible ways the child can run up to the stairs. You need to return number of possible ways W.
public class Staircase {
    public static void main(String[] args) {
        System.out.println(staircase(5));
    }

    public static int staircase(int n) {
//      Base Case
        if(n == 0){
            return 1;
        }

        if(n < 0){
            return 0;
        }

        int ans1 = staircase(n-1);
        int ans2 = staircase(n-2);
        int ans3 = staircase(n-3);

        int ans = ans1 + ans2 + ans3;

        return ans;
    }
}
