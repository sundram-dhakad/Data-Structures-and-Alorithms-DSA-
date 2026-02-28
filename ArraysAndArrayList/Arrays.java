package ArraysAndArrayList;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Five Numbers : ");

        int[]arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i]=sc.nextInt();
        }

        //First way to print this array
       // for (int i = 0; i < 5; i++) {
        //   System.out.print(arr[i] + " ");
        //}

        //Second way to print this array
        //for(int num : arr){
          //  System.out.print(num + " ");
        //}

        //Third way to print this array
        System.out.println(java.util.Arrays.toString(arr));
    }
}
