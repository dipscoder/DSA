package com.dipesh;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();

//        switch (fruit) {
//            case "Apple" :
//                System.out.println("A red fruit");
//                break;
//            case "Banana" :
//                System.out.println("A yellow fruit");
//                break;
//            case "Orange" :
//                System.out.println("A round fruit");
//                break;
//            default:
//                System.out.println("Enter a valid fruit");
//
//        Better way of writing switch statements
//        switch (fruit) {
//            case "Apple" -> System.out.println("A red fruit");
//            case "Banana" -> System.out.println("A yellow fruit");
//            case "Orange" -> System.out.println("A round fruit");
//            case "Mango" -> System.out.println("King of fruits");
//            default -> System.out.println("Enter a valid fruit");
//        }

//        Nested Switch Statements
        int empId = in.nextInt();
        String department = in.next();
        switch (empId) {
            case 1 -> System.out.println("Dipesh");
            case 2 -> System.out.println("Rohan");
            case 3 -> {
                System.out.println("Emp ID 3");
                switch (department) {
                    case "IT", "CS" -> System.out.println("From IT or CS");
                    case "MBA" -> System.out.println("From MBA");
                    case "MS" -> System.out.println("From MS");
                    default -> System.out.println("Default department");
                }
            }
            default -> System.out.println("Default Employee");
        }

    }
}
