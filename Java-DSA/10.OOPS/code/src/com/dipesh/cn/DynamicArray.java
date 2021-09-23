package com.dipesh.cn;

public class DynamicArray {
    private int[] a;
    private int nextElementIndex;

    public DynamicArray(){
        a = new int[5];
        nextElementIndex = 0;
    }
    public int[] getArray(){
        return a;
    }
    public void add(int element){
        if(nextElementIndex >= a.length ){
            // Create new array of double size
            doubleCapacity();
        }
        a[nextElementIndex] = element;
        nextElementIndex++;
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
        if(index >= nextElementIndex){
            // For Dynamic Array - Throw error
            System.out.println("No element exist on this index");
            return;
        }
        a[index] = element;
    }

    //Return that is removed
    public int removeLast(){
        if(nextElementIndex == 0){
//          Array is empty
            return -1;
        }
        int temp = a[nextElementIndex-1];
        nextElementIndex--;
//        a[nextElementIndex] = 0; // Optional
        return temp;
    }

//  Add at a specific index and shift all the other elements to right, do not replace the element
    public void addAt(int index, int element){
        if(index >= nextElementIndex){
            //Error
            return;
        }
        int[] temp = a;
        for (int i = index+1; i<=nextElementIndex;i++){
            if(i >= a.length || nextElementIndex >= a.length){
                doubleCapacity();
            }
            a[i] = temp[i-1];
        }
        a[index] = element;
        nextElementIndex++;
    }
    //  Remove at a specific index and shift all the other elements to left, do not replace the element
    public void removeAt(int index){
        if(index >= nextElementIndex || nextElementIndex == 0){
            //Error
            return;
        }
        int[] temp = a;
        for (int i = index; i<=nextElementIndex-2;i++){
            if(i >= a.length || nextElementIndex >= a.length){
                doubleCapacity();
            }
            a[i] = temp[i+1];
        }
        nextElementIndex--;
        a[nextElementIndex] = 0;
    }
    public int size(){
        return nextElementIndex;
    }

    public int get(int index){
        if(index >= nextElementIndex){
            // Throw error
            return -1;
        }
        return a[index];
    }

    public boolean isEmpty(){
        return nextElementIndex == 0;
    }

}
