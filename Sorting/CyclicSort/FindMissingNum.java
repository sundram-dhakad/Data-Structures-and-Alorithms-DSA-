package Sorting.CyclicSort;

public class FindMissingNum {
    public static void main(String[] args) {
        //Problem Statement :-
        //Given an array containing n distinct numbers in the range [0,n],
        //return the only missing number in the range that is missing in the array
        //if the array is [0,1,3,4] then n = 4, and the missing number is 2
        //if the array is [0,1,2,3] then n = 4, and the missing number is also 4

        int[]arr ={3,2,0,1};
        System.out.println(find(arr));

    }

    static int find(int[]arr){
        int n = arr.length;
        int i = 0;

        while (i< arr.length){
            if (arr[i]< arr.length && arr[i]!=i){
                swap(arr,i,arr[i]);
            }
            else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j) {
                return j;
            }
        }
        return n;
    }
    static void swap(int[]arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
