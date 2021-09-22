package com.dipesh.cn;

public class Student {
    String name;
    public String username;
    private int roll_no;
    int cgpa;
//    Final variable can be initialized only once and cannot be modified further.
//    We can initialize final variable inside constructor.
//    Final keyword is a non-access modifier.
    final double conversionRate = 0.95;

//    Static Variables
//    These are the variables that belongs to a class but can be accessed by objects also
//    UseCase - Lets say we have number of student then it is beneficial to create this variable once
//    Instead of creating for every objects

//    Also, it is good to make this variable private, so no one can change its value outside the class
    private static int numOfStudents;

//  Convention to declare final static variable is ALL CAPITAL
    final static double CONVERSIONFACTOR = 0.95;

//  Setting up rollNumber as the number of student increases
    public Student(){
        numOfStudents++;
        this.roll_no = numOfStudents;
    }

//    Getter to read number of students - Better to make function static, so we can access it with class
//    Keep in Mind- 1. Static functions cannot use non-static variables.
//    2. Static function cannot call non-static function.
//    3. this or super keyword cannot be used inside a static function.
    public static int getNumStudent(){
//        getRoll_no(); // error
//        roll_no = 10 // error
//        System.out.print(this.name); // error
        return numOfStudents;
    }


//    Getter
    public int getRoll_no(){
        return roll_no;
    }

//    Setter
    public void setRoll_no(int num){
        if(num > 0)
            roll_no = num;
        else
            System.out.println("Invalid Roll Number");
    }
    public void setRoll_noWithThis(int roll_no){
        //Here local variable and object have same name - "roll_no"
        //That's why we need to use "this" keyword
        //"this" contains or refer the reference through which function is called
        //simple terms-it contains the address of the reference(in our case s3)
        System.out.println("this contains = "+this);
        if(roll_no > 0)
            this.roll_no = roll_no;
        else
            System.out.println("Invalid Roll Number");
    }
}
