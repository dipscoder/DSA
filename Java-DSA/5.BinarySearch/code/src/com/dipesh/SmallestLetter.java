package com.dipesh;

public class SmallestLetter {

    public static void main(String[] args) {
	// write your code here
        char[] a = {'c','f','j'};
        char target = 'g';
        System.out.println(nextGreatestLetter(a,target));
    }

//    return index of the smallest number which <= target
    static char nextGreatestLetter(char[] letters, char target){
//        Wrap around
        if(target >= letters[letters.length - 1]){
            return letters[0];
//            or
//            return letters[start % letters.length]
        }

        int start = 0;
        int end = letters.length-1;

        while(start <= end){

            int mid = start + (end-start) / 2;

            if(letters[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return letters[start];
    }

}


