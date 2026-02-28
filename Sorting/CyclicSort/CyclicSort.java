package Sorting.CyclicSort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[]arr = {5,4,3,2,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //to sort the array of elements from 1 to n
    static void cyclicSort(int[] arr) {
        int i=0;
        while (i<arr.length){
            //if element at its correct index just increment the i
            if (arr[i]==i+1){
                i++;
            }
            //else swap the element with its correct index
            else {
                swap(arr, i, arr[i]-1);
            }
        }
    }

    static void swap(int[]arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
