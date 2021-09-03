package com.dipesh;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float num1 = in.nextFloat();
        float num2 = in.nextFloat();
        float num3 = in.nextFloat();

//        First Method
//        if(num1 > num2){
//            if(num1 > num3){
//                System.out.println("Largest: "+num1);
//            }
//            else {
//                System.out.println("Largest: " + num3);
//            }
//        }
//        else {
//            if(num2 > num3) {
//                System.out.println("Largest: "+num2);
//            }
//            else{
//                System.out.println("Largest: "+num3);
//            }
//        }

//        Second method
//        float max = num1;
//        if(num2 > max) {
//            max = num2;
//        }
//        if(num3 > max) {
//            max = num3;
//        }
//        System.out.println(max);

//        Inbuilt method
        float max = Math.max(num3, Math.max(num1,num2));
        System.out.println(max);
    }
}
