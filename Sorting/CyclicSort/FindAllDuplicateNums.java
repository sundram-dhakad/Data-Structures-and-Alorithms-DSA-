package Sorting.CyclicSort;

import java.util.ArrayList;

public class FindAllDuplicateNums {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(find(arr));

    }
    static ArrayList<Integer> find(int[]arr){
       int i = 0;
       while (i< arr.length){
           if(arr[i] != i+1){
               if (arr[i] == arr[arr[i]-1]) {
                   i++;
               }
               else {
                   swap(arr,i,arr[i]-1);
               }
           }
           else {
               i++;
           }
       }

       ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j+1){
                list.add(arr[j]);
            }
        }
        return list;
    }
    static void swap(int[]arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
