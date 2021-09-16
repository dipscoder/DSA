package com.dipesh;

import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
//      Flow print --> valueOf --> toString
//      Any datatype will be converted into string with toString

        System.out.println(56); //Internally it also uses the Integer wrapper class

//        Integer num = new Integer(56);  // Using toString method of Integer
//        System.out.println(Integer.toString(num));
//        System.out.println(num); // Same as above


        System.out.println("Hello");

//      Default toString for object returns a random hash value
        System.out.println(new int[]{88,77,66});
//      Define or Use different toString method explicitly to print the object
        System.out.println(Arrays.toString(new int[]{88,77,66}));
    }
}
