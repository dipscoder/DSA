package com.dipesh.cn.assignment;

import java.util.Arrays;

public class PairSum {
    public static void main(String[] args) {
        int[] a = {1,3,6,2,5,4,3,2,4};
        int[] a1 = {3,3,3,3,3};
        int[] a2 = {0,6,0,0};

        int target = 12;
        int target1 = 6;
        int target2 = 6;
        System.out.println(pairSum(a,target));
        System.out.println(pairSum(a1,target1));
        System.out.println(pairSum(a2,target2));
    }

    public static int pairSum(int[] a, int num){
//      Brute Force - O(n^2)
//        int pairCount = 0;
//
//        for(int i=0;i<a.length;i++){
//            for(int j=i+1;j<a.length;j++){
//                if(a[i] + a[j] == num){
//                    pairCount++;
//                }
//            }
//        }
//        return pairCount;

//----------------------------------------------------------------------------------------------
//      2nd Approach - O(nlogn)
//      If we had to print the pairs then the TC would be O(n^2) because of edge case1
        Arrays.sort(a); // O(nlogn)

        int startIndex = 0;
        int endIndex = a.length-1;
        int pairCount = 0;
        while (startIndex<endIndex){
            if(a[startIndex] + a[endIndex] < num){
                startIndex++;
            }
            else if(a[startIndex] + a[endIndex] > num){
                endIndex--;
            }
            else {
//              Edge Case1 -> If a = [2,2,2,2,2] then ans = 4+3+2+1 = 10(basically n=5 & (n-1)=4,so (n-1)*n /2
                int elementAtStart = a[startIndex];
                int elementAtEnd = a[endIndex];
                if(elementAtStart == elementAtEnd){
                    int totalSameElementsFromStartToEnd = (endIndex-startIndex) + 1;
                    pairCount = pairCount + (totalSameElementsFromStartToEnd * (totalSameElementsFromStartToEnd -1)) / 2;

                    return pairCount;
                }

//              Edge Case2 -> [1,3,3,3,4,5,8,9,9,9,9,10] target=12
//              Here not all elements are same but some are duplicate, so find how many duplicate elements are there that forming pair
//              Ex - (3,9) == 12 check if 3,9 are repeated, count '3' = 3 times and '9' = 4
//              So totalPairs formed by (3,9) are -> 3*4 = 12.

                int tempStartIndex = startIndex+1;
                int tempEndIndex = endIndex-1;

                while (tempStartIndex <= tempEndIndex && elementAtStart == a[tempStartIndex] ){
                    tempStartIndex++;
                }
                while (tempEndIndex >= tempStartIndex && elementAtEnd == a[tempEndIndex]){
                    tempEndIndex--;
                }

                int totalElementsFromStart = (tempStartIndex - startIndex);
                int totalElementsFromEnd = (endIndex - tempEndIndex);

                pairCount = pairCount + (totalElementsFromStart * totalElementsFromEnd);

                startIndex = tempStartIndex;
                endIndex = tempEndIndex;
            }
        }

        return pairCount;
    }
}
