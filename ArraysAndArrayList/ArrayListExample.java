package ArraysAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("List at the start : "+list);

        list.add(1,90);
        System.out.println("List after updating : "+list);

        list.remove(0);
        System.out.println("List after removing : "+list);
        */

        //Taking user input
        ArrayList<String> strList = new ArrayList<>();

        System.out.println("Enter elements of list : (type exit to stop!)");
        while (true){
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")){
                break;
            }

            strList.add(input);
        }
        System.out.println("The elements in the list are : "+strList);

    }
}
