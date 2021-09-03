package com.dipesh;

public class Evendigits {
    public static void main(String[] args) {
        int[] a = {12,345,2,6,7896};
        System.out.println(findNumbers(a));
        System.out.println(digits2(0));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(checkEven(nums[i])){
                count++;
            }
        }
        return count;
    }

    static boolean checkEven(int num) {
        int numberOfDigits = digits(num);

        return numberOfDigits % 2 == 0;
    }

    static int digits(int num) {
        int count = 0;
        if(num < 0)
            num = num * -1;

        if(num == 0) return 1;
        while (num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }

    static int digits2(int num) {
        if(num < 0)
            num = num * -1;
        if(num == 0) return 1;
        return (int) ((Math.log10(num)) + 1);
    }


}

