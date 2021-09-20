package com.dipesh.cn;

public class StudentUse {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        //s1 is just a reference which points to the object
        //s1 stored in stack and objects are stored in heap
        //this will return the :- package@addressOfObject
        System.out.println(s1);

//      Default Values
        System.out.println(s1.name+" "+s1.roll_no);

        s1.name = "Dipesh";
        s2.name = "Wini";
        s1.roll_no = 8;
        s2.roll_no = 36;
        System.out.println(s1.name+" "+s1.roll_no);
        System.out.println(s2.name+" "+s2.roll_no);

        Student s3;
//        System.out.println(s3); // Not initialized error
        s3 = new Student();
        System.out.println(s3);
    }
}
