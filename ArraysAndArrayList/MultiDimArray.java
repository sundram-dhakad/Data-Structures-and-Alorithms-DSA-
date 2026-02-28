package ArraysAndArrayList;

import java.util.Scanner;

public class MultiDimArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        /*for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }*/

        //Another way to print this 2d array
        for (int[] row : arr){
            System.out.println(java.util.Arrays.toString(row));
        }
    }
}
