package com.dipesh.cn;

public class Constructors {
    int rollNo;
    String name;

//    Constructors do not have any return type and first letter is capital
    public Constructors(String n, int num){
        //Good Example of constructor
        //Call to 'this()' must be first statement in constructor body
        this("Dips");
        System.out.println(this);
        System.out.println("Constructor with two argument");

        rollNo = num;
        name = n;

    }

    //With one argument
    public Constructors(String name){
        this.name = name;
        this.getDetails();
        System.out.println("Constructor with one argument");
    }

    //Default Constructor
    public Constructors(){

    }



    public void getDetails(){
        System.out.println(this.name+" "+this.rollNo);
    }
}
