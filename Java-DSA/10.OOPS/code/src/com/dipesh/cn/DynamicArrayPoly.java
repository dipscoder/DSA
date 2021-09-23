package com.dipesh.cn;

public class DynamicArrayPoly {
    private int[] a;

    public DynamicArrayPoly(){
        a = new int[5];
    }


    private void doubleCapacity() {
//      This will not copy the array but store the reference as 'a' store the address where actual array is located
        int[] temp = a;
        a = new int[2 * temp.length];
//      Copying the old values
        for (int i=0;i<temp.length;i++){
            a[i] = temp[i];
        }
    }

//  Replace with new element on given index
    public void set(int index, int element){
        if(index >= a.length){
            doubleCapacity();
        }
        a[index] = element;
    }




    public int size(){
        return a.length;
    }

    public int get(int index){
        if(index >= a.length){
            doubleCapacity();
        }
        return a[index];
    }


}
