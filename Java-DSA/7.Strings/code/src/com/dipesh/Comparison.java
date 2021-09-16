package com.dipesh;

public class Comparison {
    public static void main(String[] args) {
        String a = "Dipesh";
        String b = "Dipesh";

//      "==" compares the object as a & b pointing to same object thats why it will print true
        System.out.println(a==b); //true

//      Telling java explicitly to create different objects
        String c = new String("Jaiswal");
        String d = new String("Jaiswal");
//      Here values are same but not the object as we are creating two objects with same value
        System.out.println(c==d); //false

//      ".equals()" check for the value
        System.out.println(c.equals(d)); //true
    }
}
