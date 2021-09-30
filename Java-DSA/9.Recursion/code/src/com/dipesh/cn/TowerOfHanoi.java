package com.dipesh.cn;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
        int n = 3;
        towerOfHanoi(n,'s','h','d');
    }

    private static void towerOfHanoi(int n, char s, char h, char d) {
        if(n == 0){
            return;
        }
        if(n == 1){
            System.out.println("Move disk 1 from source "+s+" to destination "+d);
            return;
        }

//      Move n-1 disks from s to h
//      Move nth disk(last or biggest disk) from s to d
//      Move n-1 disks from h to d
        towerOfHanoi(n-1,s,d,h);
        System.out.println("Move disk "+n+" from source "+s+" to destination "+d);
        towerOfHanoi(n-1,h,s,d);
    }


}
