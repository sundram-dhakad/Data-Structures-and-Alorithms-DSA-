package LinearSearch;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[]arr = {25,50,75,10,5,15,20};

        System.out.print("Enter the element you want to search : ");
        int element = sc.nextInt();

        linearSearch(arr,element);
    }
    static void linearSearch(int[]arr, int target){
        if (arr.length == 0){
            System.out.println("Empty Array");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                System.out.println("Element found at index no. "+i);
                return;
            }
        }
        System.out.println("Element Not Found!");
    }
}
