package com.dipesh.cn.oops2.inheritance2;

import com.dipesh.cn.oops2.inheritance.Vehicle;

public class Truck extends Vehicle {
    int maxTruckSpeed;

//  maxSpeed is accessible because this is a derived/child class
    public void print(){
        System.out.println("Car Max Speed: "+maxSpeed+" maxTruckSpeed: "+maxTruckSpeed);
    }
}
