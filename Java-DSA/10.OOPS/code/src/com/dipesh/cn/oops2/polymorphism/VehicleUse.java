package com.dipesh.cn.oops2.polymorphism;

public class VehicleUse {
    public static void main(String[] args) {

//      We can do this because
//      If we have a reference(v) of base class then that reference can refer to the objects of child/derived classes as well
//      Every Car is a Vehicle

        Vehicle v = new Car(4,90);
//        Vehicle v1 = new Bicycle(); // Valid
//        Car c = new Vehicle(); // Not Valid

        v.maxSpeed = 60;
//      We cannot access the child classes objects because anyone can change the reference to Bicycle or something else
//      In that case, properties of car will make no sense, so compiler throw a compiled time error
//      v.noOfDoor = 5;  // Compiled Time Error but in Runtime it is ok

        v.print(); // It will call car's print as vehicle & car both have print method
//        v.printMaxSpeed(); // Complied Time error but in Runtime it is ok

//      Conclusion
//      1. All the properties are checked at complied time, so we cannot access specific(child's) properties through parent reference
//      2. The method call is checked at runtime and if parent and child class both have the same function then only the child function is called.

    }


}
