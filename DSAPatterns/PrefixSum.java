package DSAPatterns;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int []arr = {2,5,4,1,7,0,10,50,70};
        prefixSum(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void prefixSum(int[]arr){
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i-1];
        }
    }
}
