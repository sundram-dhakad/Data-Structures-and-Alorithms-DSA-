package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[]arr = {5,2,-5,0,10};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[]arr){
        boolean swapped;

        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //We are not gonna check the elements that are already sorted
            //because in each time one largest element will come in last position
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped = true; //if swap occurs
                }
            }

            //if no swap occurs during entire one loop it means the array is sorted and we dont need further swap
            if (!swapped){
                break;
            }
        }
    }
}
