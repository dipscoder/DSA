package com.dipesh.cn.oops2.inheritance;

public class Car extends Vehicle{
    int noOfDoor;
    int maxSpeed;
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
