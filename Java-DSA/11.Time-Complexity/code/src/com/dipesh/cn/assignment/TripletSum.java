package com.dipesh.cn.assignment;

import java.util.Arrays;

//  You have been given a random integer array/list(ARR) and a number X. Find and return the triplet(s) in the array/list which sum to X.
public class TripletSum {

    public static void main(String[] args) {
        int[] a = {6,1,6,5,3,2,5,0,5,6,0};
        int num = 5;
        int[] a1 = {6,1,6,5,3,2};
        int num1 = 6;
        int[] a2 = {};
        int num2 = 5;
        int[] a3 = {1,1,1,1,1};
        int num3 = 3;

        System.out.println(tripletSum(a,num));      //5
        System.out.println(tripletSum(a1,num1));    //1
        System.out.println(tripletSum(a2,num2));    //0
        System.out.println(tripletSum(a3,num3));    //10
    }

    public static int tripletSum(int[] a, int Num){
//      x+y+z = Num then x+y = Num-z

        Arrays.sort(a);

        int tripletSum = 0;

        for(int i = 0; i<a.length;i++){
            int target = Num - a[i];
            int start = i+1;
            int end = a.length-1;

            while (start < end){
                if(a[start] + a[end] < target){
                    start++;
                }
                else if (a[start] + a[end] > target){
                    end--;
                }
                else{
//                  Edge case1 - [2,2,2,2,2]
                    if(a[start] == a[end]){
                        int totalElementsFromSToE = end - start+1;
                        tripletSum += ((totalElementsFromSToE - 1) * totalElementsFromSToE) / 2;
                        break;
                    }
//                  Edge case2 - [1,2,3,3,3,5,6,9,9,9,9,10]

                    int elementsFromS = 1;
                    int elementsFromE = 1;
                    while (a[start] == a[start+1]){
                        start++;
                        elementsFromS++;
                    }
                    while (a[end] == a[end-1]){
                        end--;
                        elementsFromE++;
                    }

                    tripletSum += elementsFromE * elementsFromS;

                    start++;
                    end--;
                }
            }
        }
    return tripletSum;
    }

}
