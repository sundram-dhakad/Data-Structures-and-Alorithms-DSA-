package Sorting;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int [] arr = {170,45,75,90,802,24,2,66};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void radixSort(int []arr){
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        for (int exp = 1; max/exp>0 ; exp*=10) {
            countSort(arr,exp);
        }
    }

    static void countSort(int[]arr, int exp){
        int n = arr.length;;
        int [] output = new int[n];
        int [] count = new int[10];

        for (int i = 0; i <n ; i++) {
            int digit = (arr[i]/exp)%10;
            count[digit]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i-1];
        }

        for (int i = n-1; i >=0 ; i--) {
            int digit = (arr[i]/exp)%10;
            output[count[digit]-1] = arr[i];
            count[digit]--;
        }

        System.arraycopy(output,0,arr,0,n);
    }
}
