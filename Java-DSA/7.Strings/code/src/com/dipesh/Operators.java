package com.dipesh;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
//      + operator with Character(char) converts the values in its ASCII value
        System.out.println('a' + 'b'); // 195
//      Here "a" + "b" --> will create a new object "ab"
        System.out.println("a" + "b"); // ab

        System.out.println('a' + 3); // 100
        System.out.println((char)('a' + 3)); // d

        // When an integer is concatenated with a string then
        // integer will be converted to Integer that will call toString()
        // this is same as after a few steps: "a" + "1"
        System.out.println("a" + 1); // a1

        // Anything,even objects, when concatenated with a string will get converted into string
        System.out.println("dipesh" + new ArrayList<>()); // dipesh[]
        System.out.println("dipesh" + new Integer(56)); // dipesh56

//      IMP - "+" in java, we can only use it with primitives and with complex objects as well but
//      The only condition is that atleast one of these objects should be of type String

//        System.out.println(new Integer(56) + new ArrayList<>()); // --> Will give error

        String ans = new Integer(56) + "" + new ArrayList<>(); // --> Will work
        System.out.println(ans); // 56[]

        System.out.println("" + new int[]{1,2,3,4}); // [I@776ec8df -> as it is using default toString method

        System.out.println("a" + 'b'); // ab
    }
}
