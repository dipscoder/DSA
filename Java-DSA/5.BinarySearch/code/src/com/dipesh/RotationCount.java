package com.dipesh;
//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class RotationCount {
    public static void main(String[] args) {
        int[] a = {4,5,6,7,0,1,2};
        int[] d = {4,4,5,5,7,7,8,2,3,3,4};
        System.out.println(countTheRotations(a));
        System.out.println(findPivotWithDuplicates(d) + 1);
    }

    private static int countTheRotations(int[] a) {
        int pivot = findPivot(a);
        return pivot + 1;
    }

    //  will not work if array consist of duplicate items
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(mid > start && arr[mid] < arr[mid-1]){
                return mid - 1;
            }
//            Pivot lies on the left-hand side and mid is currently in section 2
            else if(arr[start] >= arr[mid]){
                end = mid - 1;
            }
//            Pivot lies on the right-hand side and mid is currently in section1
//            arr[start] < arr[mid]
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid - 1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if(arr[start] == arr[mid] || arr[mid] == arr[end]){
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
//            Pivot lies on the left-hand side and mid is currently in section 2
            else if(arr[start] > arr[mid] || (arr[start] == arr[mid]) && arr[mid] < arr[end] ){
                end = mid - 1;
            }
//            Pivot lies on the right-hand side and mid is currently in section1
//            arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
