package Recursion;

import java.util.Arrays;

public class RecursiveSelectionSort {
    public static void main(String[] args) {
        int[]arr = {10,50,40,20,30};
        sort(arr,arr.length-1,1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[]arr, int r, int c, int max){
        if (r == 0){
            return;
        }

        if (c<=r){
            if (arr[c] > arr[max]){
                max = c;
            }
            sort(arr,r,c+1,max);
        }
        else {
            int temp = arr[max];
            arr[max] = arr[r];
            arr[r] = temp;
            sort(arr,r-1,1,0);
        }
    }
}
