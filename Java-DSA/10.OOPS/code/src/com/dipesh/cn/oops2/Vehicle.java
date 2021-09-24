package com.dipesh.cn.oops2;

public class Vehicle {
    String color;
    int maxSpeed;
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
