package com.dipesh.cn.oops2.polymorphism;

public class Car extends Vehicle {
    int noOfDoor;
//    int maxSpeed;

//  This default will implicitly will call the parent default constructor(vehicle's)
    Car(int noOfDoor, int maxSpeed){
//      If there is no default then we need to call constructor explicitly
//      This super will call the parent constructor but - Call to 'super()' must be first statement in constructor body
        super(maxSpeed);
        System.out.println("Car's Constructor");
//        super(100); // error
        this.noOfDoor = noOfDoor;
    }


//    Overrides method in Vehicle
    public void print(){
//      It will call the print method of parent class
        super.print();
        System.out.println("Car "+"Color: "+color+" Max Speed: "+maxSpeed+" No of doors: "+noOfDoor);
    }

    public void printMaxSpeed(){
//      It will get the maxSpeed variable of parent class
        System.out.println("Car MaxSpeed: "+maxSpeed+" Vehicle MaxSpeed: "+super.maxSpeed);
    }
    public void printCar(){
        System.out.println("Car "+"Color: "+color+" Max Speed: "+maxSpeed+" No of doors: "+noOfDoor+" Vehicle Number:"+get());
    }
}
