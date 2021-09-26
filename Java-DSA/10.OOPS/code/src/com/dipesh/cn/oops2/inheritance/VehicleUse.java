package com.dipesh.cn.oops2.inheritance;

public class VehicleUse {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.color = "Red";
        v.maxSpeed = 100;
        v.print();

        Car c = new Car();
        c.color = "blue";
        c.maxSpeed = 90;
        c.noOfDoor = 4;
        c.set(1);
        c.print();
        c.printCar();
        Bicycle b =  new Bicycle();
        b.color = "black";
        b.maxSpeed = 10;
        b.print();
    }


}
