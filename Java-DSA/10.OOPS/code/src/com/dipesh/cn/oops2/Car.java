package com.dipesh.cn.oops2;

public class Car extends Vehicle{
    int noOfDoor;

//    Overrides method in Vehicle
    public void print(){
        System.out.println("Car "+"Color: "+color+" Max Speed: "+maxSpeed+" No of doors: "+noOfDoor);
    }

    public void printCar(){
        System.out.println("Car "+"Color: "+color+" Max Speed: "+maxSpeed+" No of doors: "+noOfDoor+" Vehicle Number:"+get());
    }
}
