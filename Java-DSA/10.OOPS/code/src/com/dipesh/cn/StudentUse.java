package com.dipesh.cn;

public class StudentUse {
    public static void main(String[] args) {

//      As Static variable belongs to Class
//      We can access Static variable before creation of any object and can access with Class instead of object
        System.out.println("Initial value of static variable="+Student.numOfStudents);

        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(s1.numOfStudents);
        System.out.println(s2.numOfStudents);
        // Better way to access static variables is by class
        System.out.println("Value of static variable="+Student.numOfStudents);

        //s1 is just a reference which points to the object
        //s1 stored in stack and objects are stored in heap
        //this will return the :- package@addressOfObject
        System.out.println(s1);

//      Default Values
//        System.out.println(s1.name+" "+s1.roll_no); // null 0

        s1.name = "Dipesh";
        s2.name = "Wini";
//        s1.roll_no = 8;
//        s2.roll_no = 36;
//        System.out.println(s1.name+" "+s1.roll_no);
//        System.out.println(s2.name+" "+s2.roll_no);

//      Setter usecase;
        s1.setRoll_no(8);
        s2.setRoll_no(36);

//      Getter usecase
        System.out.println(s1.name+" "+s1.getRoll_no());
        System.out.println(s2.name+" "+s2.getRoll_no());

//      "this" usecase
        Student s3;
//        System.out.println(s3); // Not initialized error
        s3 = new Student();
        s3.setRoll_noWithThis(44);
        System.out.println("s3 contains = "+s3);
        System.out.println("s3 rollno = "+ s3.getRoll_no());

//      Final Keyword Usecase
//        s1.conversionRate = 0.5; //error
        System.out.println(s1.conversionRate); // can read but cannot write
    }
}
