package com.dipesh.cn;

public class ArrayIntersection {

    public static void main(String[] args) {
        int[] a = {4,22,5,6,1,33,22,1};
        int[] b = {4,22,1,4,1};
        intersection(a,b);
    }

    public static void intersection(int[] arr1, int[] arr2) {
        //Your code goes here

//      0th Approach - Brute Force - n^2

//      1st Approach - Sort two or one arrays, search through Bineary Search and remove that element from the array(to handle duplicate element case) &
//      Time Complexity - nlogn + mlogm + n logm(bineary search) + space complexity, still better than n^2
//         qs(arr1,0,arr1.length-1);
//     	qs(arr2,0,arr2.length-1);

//         int index = 0;
//         for(int i=0;i<arr1.length;i++){
//             index = bs(arr2,arr1[i]);

//             if(index < 0){
//                 continue;
//             }

//             System.out.print(arr2[index] + " ");
//             arr2 = removeTheElement(arr2, index);
//         }

//         System.out.println();



//      2nd Approach - Similar to Merging of two arrays
//      Time Complexity - nlogn + mlogm + O(m+n) (merging) , still better than n^2 and 1st approach
        qs(arr1,0,arr1.length-1);
        qs(arr2,0,arr2.length-1);
        int i = 0;
        int j = 0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] == arr2[j]){
                System.out.print(arr1[i] + " ");
                i++;
                j++;

            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
            else {
                j++;
            }
        }

        System.out.println();


//      3rd Approach(Best) - Usign Hash maps

    }

    // Function to remove the element
    public static int[] removeTheElement(int[] arr,
                                         int index)
    {

        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null
                || index < 0
                || index >= arr.length) {

            return arr;
        }

        // Create another array of size one less
        int[] anotherArray = new int[arr.length - 1];

        // Copy the elements from starting till index
        // from original array to the other array
        System.arraycopy(arr, 0, anotherArray, 0, index);

        // Copy the elements from index + 1 till end
        // from original array to the other array
        System.arraycopy(arr, index + 1,
                anotherArray, index,
                arr.length - index - 1);

        // return the resultant array
        return anotherArray;
    }


    //  Binary Search
    public static int bs(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start) / 2;

            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }


    //  Quick Sort
    public static void qs(int[] a, int start, int end){
        if(start >= end){
            return;
        }

        int pivotIndex = partition(a,start,end);
        qs(a,start,pivotIndex-1);
        qs(a,pivotIndex+1,end);
    }

    public static int partition(int[] a, int start, int end){
        int pivotIndex = start;
        int smallNumCount = 0;


        for(int i=start;i<=end;i++){
            if(a[i] < a[pivotIndex]){
                smallNumCount++;
            }
        }
        swap(a,pivotIndex, pivotIndex + smallNumCount);
        pivotIndex = pivotIndex + smallNumCount;


        int i = start;
        int j = end;

        while(i < pivotIndex && j > pivotIndex){
            if(a[i] < a[pivotIndex]){
                i++;
            }
            else if(a[j] >= a[pivotIndex]){
                j--;
            }
            else {
                swap(a,i,j);
                i++;
                j--;
            }
        }

        return pivotIndex;

    }

    public static void swap(int[] a, int first, int second){
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }

}
