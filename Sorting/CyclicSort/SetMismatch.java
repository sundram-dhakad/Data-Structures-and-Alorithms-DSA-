package Sorting.CyclicSort;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        //Problem Statement :-
        //We have to find which number is getting repeated and due to which, which number is being lost
        //for example, if arr = {1,2,2,4}, then here 2 is getting repeated and 3 is missing
        //so answer = {2,3}

        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    static int[] findErrorNums(int[] arr){
        int i = 0;
        while (i< arr.length){
            if(arr[i] != i+1){
                if (arr[i] == arr[arr[i]-1]) {
                    return new int[]{arr[i], i+1};
                }
                else {
                    swap(arr,i,arr[i]-1);
                }
            }
            else {
                i++;
            }
        }
        return new int[]{-1};
    }

    static void swap(int[]arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
