package ArraysAndArrayList;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[]arr = {10,20,30,40,50};
        System.out.println("Original Array : "+ Arrays.toString(arr));
        System.out.println("Reversed Array : "+Arrays.toString(revArray(arr)));

    }
    static int[] revArray(int[]arr){
        int[] revArr = new int[arr.length];
        int j = arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            revArr[i]=arr[j];
            j--;
        }

        return revArr;
    }
}
