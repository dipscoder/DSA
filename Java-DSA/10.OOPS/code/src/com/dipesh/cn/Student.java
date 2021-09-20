package com.dipesh.cn;

public class Student {
    String name;
    public String username;
    private int roll_no;

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
