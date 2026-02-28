package ArraysAndArrayList;

import java.util.Arrays;

public class MaxValueEx {
    public static void main(String[] args) {
        int[]arr = {5,25,10,70,900,50};

        System.out.println("Array : "+ Arrays.toString(arr));
        System.out.println("Maximum Number : "+maxNum(arr));

    }
    static int maxNum(int[]arr){
        int maxNum =arr[0];
        for (int i = 0; i < arr.length ; i++) {
              if (arr[i]>maxNum){
                  maxNum=arr[i];
              }
        }
        return maxNum;
    }
}
