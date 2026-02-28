package LinearSearch;

import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][]arr = {
                {15,20,25},
                {10,18,16},
                {8,5,7,35},
                {50,9}
        };

        int target = 9;
        int[]ans = search(arr,target);
        System.out.println("Target Element found at index : "+Arrays.toString(ans));

        System.out.println("Maximum Number : "+maxNum(arr));
    }

    //Search an element in 2d array
    static int[] search(int[][]arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    //Maximum Num in 2d array
    static int maxNum(int[][]arr){
        int max = Integer.MIN_VALUE;

        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }
}
