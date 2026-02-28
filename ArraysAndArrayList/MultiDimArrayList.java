package ArraysAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //Initialization
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        System.out.print("Enter Elements : ");
        //Adding elements through input
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }

        //System.out.println(list);

        //Printing elements in matrix form
        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i));
        }


    }
}
