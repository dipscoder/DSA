package com.dipesh;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello String!");
        String name = "Dipesh Jaiswal";
        System.out.println(name);

//      Strings are immutable means it can not be changed
        String a = "Dips";
        System.out.println(a);
        //But
//      Here we are not changing the values but creating a new object
        a = "Dipesh";
        System.out.println(a);
    }
}
