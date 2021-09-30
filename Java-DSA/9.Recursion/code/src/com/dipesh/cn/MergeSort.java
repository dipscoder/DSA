package com.dipesh.cn;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {2,5,3,12,56,1,23,-1,-12,0};
        ms(a);
        System.out.println(Arrays.toString(a));
    }

    public static void merge(int[] a,int[] temp1,int[] temp2){
        int i = 0;
        int j = 0;
        int k = 0;
        while (i<temp1.length && j < temp2.length){
            if(temp1[i] < temp2[j]){
                a[k] = temp1[i];
                k++;
                i++;
            }
            else{
                a[k] = temp2[j];
                k++;
                j++;
            }
        }

        if(i < temp1.length){
            while (i < temp1.length){
                a[k] = temp1[i];
                k++;
                i++;
            }
        }
        if(j < temp2.length){
            while (j < temp2.length){
                a[k] = temp2[j];
                k++;
                j++;
            }
        }
    }

    public static void ms(int[] a){
//      Base Case
        if(a.length <= 1){
            return;
        }

        int mid = a.length/2;
        int[] temp1 = new int[mid];
        int[] temp2 = new int[a.length - temp1.length];

        for (int i = 0; i<temp1.length;i++){
            temp1[i] = a[i];
        }

        for (int j = mid; j<a.length;j++){
            temp2[j - mid] = a[j];
        }

        ms(temp1);
        ms(temp2);

        merge(a,temp1,temp2);

    }
}
