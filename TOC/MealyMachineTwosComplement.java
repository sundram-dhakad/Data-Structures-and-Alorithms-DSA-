package TOC;

import java.util.Scanner;

public class MealyMachineTwosComplement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Input String : ");
        String ip = sc.nextLine();

        char state = 'A';

        String op = "";

        for(int i = ip.length()-1; i>=0; i--) {
            char curr = ip.charAt(i);
            System.out.println("\nCurrent State : " + state);
            System.out.println("Current input : " + curr);
            if (state == 'A' && curr == '0') {
                op = curr + op;
            } else if (state == 'A' && curr == '1') {
                op = curr + op;
                state = 'B';
            } else if (state == 'B' && curr == '0') {
                op = '1' + op;
            } else {
                op = '0' + op;
            }
            System.out.println("Current output : " + op);
        }
    }
}
