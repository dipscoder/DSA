package com.dipesh.cn.oops2.inheritance;

public class Vehicle {
    String color;
//  Protected modifier are accessible in same class, package and in derived/child class in different package
    protected int maxSpeed;
//  Private variables are inherited but cannot be accessed
    private int vehicleNumber;

    public void print(){
        System.out.println("Vehicle "+"Color: "+color+" Max Speed: "+maxSpeed );
    }

    public void set(int num){
        vehicleNumber = num;
    }
    public int get(){
        return vehicleNumber;
    }
}
