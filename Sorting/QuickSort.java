package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,6};
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int low , int high){
        if (low >= high){
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end-start)/2;

        //choosing pivot
        //here we are taking mid-element as pivot, we can choose any element
        int pivot = arr[mid];

        //Putting pivot at the correct position
        //Such that all elements smaller than pivot will come at left hand side of pivot
        //and all elements that are greater than pivot will come at right hand side of pivot
        while (start <= end){
            while (arr[start]<pivot){
                start++;
            }
            while (arr[end]>pivot){
                end--;
            }

            if (start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        //Recursive calls
        quickSort(arr,low,end);
        quickSort(arr,start,high);
    }
}
