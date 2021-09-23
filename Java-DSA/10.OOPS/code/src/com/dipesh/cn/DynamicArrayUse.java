package com.dipesh.cn;
// Custom Dynamic Array
import java.util.Arrays;

public class DynamicArrayUse {
    public static void main(String[] args) {
        DynamicArray d = new DynamicArray();

        for(int i = 1; i<=10;i++){
            d.add(100+i);
        }
        System.out.println(Arrays.toString(d.getArray()));

        System.out.println(d.size());
        System.out.println(d.get(3));
        d.set(3,70);
        System.out.println(d.get(3));

//      Add at a specific index
        System.out.println(Arrays.toString(d.getArray()));
        d.addAt(9,59);
        System.out.println(Arrays.toString(d.getArray()));
        System.out.println(d.size());

//      Remove at a specific index
        System.out.println(Arrays.toString(d.getArray()));
        d.removeAt(3);
        System.out.println(Arrays.toString(d.getArray()));
        System.out.println(d.size());


//        while(!d.isEmpty()){
//            System.out.println(d.removeLast());
//            System.out.println("Size = "+d.size());
//        }
    }


}
