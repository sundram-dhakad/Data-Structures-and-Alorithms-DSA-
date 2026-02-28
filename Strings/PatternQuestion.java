package Strings;

public class PatternQuestion {
    public static void main(String[] args) {
        //pattern1(5);
        //pattern2(5);
        //pattern3(5);
        //pattern4(5);
        //pattern5(5);
        //pattern6(5);
        //pattern28(5);
        //pattern30(5);
        pattern31(4);
    }

    //Pattern 31
    static void pattern31(int n){
        int tempN = 2*n-1;
        for (int i = 1; i <= tempN ; i++) {
            for (int j = 1; j <= tempN ; j++) {
                int AtEveryIndex = n - Math.min(Math.min(i-1,j-1),Math.min(tempN-i,tempN-j));
                System.out.print(AtEveryIndex+" ");
            }
            //new line
            System.out.println();
        }
    }
    //Pattern 30
    static void pattern30(int n){
        for (int i = 1; i <= n ; i++) {

            int spaces = n-i;
            for (int k = 0; k < spaces; k++) {
                System.out.print("  ");
            }

            int value = i;

            for (int j = 1; j <= i*2-1 ; j++) {
                if (j<=i){
                    System.out.print(value+" ");
                    value--;
                }
                else {
                    value = j-(i-1);
                    System.out.print(value+" ");
                }
            }
            //new line
            System.out.println();
        }
    }

    //Pattern 28
    static void pattern28(int n){
        int column = 0;
        for (int i = 1; i < 2*n ; i++) {
            if (i <= n){
                column++;
            }
            else {
                column--;
            }

            int spaces = n-column;
            for (int k = 0; k < spaces; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= column ; j++) {
                System.out.print("* ");
            }
            //new line
            System.out.println();
        }
    }

    //Pattern 6
    static void pattern6(int n){  //n = number of lines
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n ; j++) {
                if (j <= n-i){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            //new line
            System.out.println();
        }
    }

    //Pattern 5
    static void pattern5(int n){
        int column = 0;
        for (int i = 1; i < 2*n ; i++) {
            if (i <= n){
                column++;
            }
            else {
                column--;
            }
            for (int j = 1; j <= column ; j++) {
                System.out.print("*");
            }
            //new line
            System.out.println();
        }
    }

    //Pattern 4
    static void pattern4(int n){  //n = number of lines
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+" ");
            }
            //new line
            System.out.println();
        }
    }

    //Pattern 3
    static void pattern3(int n){  //n = number of lines
        for (int i = 1; i <= n; i++) {
            for (int j = n+1-i; j >= 1 ; j--) {
                System.out.print("*");
            }
            //new line
            System.out.println();
        }
    }

    //Pattern 2
    static void pattern2(int n){  //n = number of lines
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            //new line
            System.out.println();
        }
    }

    //Pattern 1
    static void pattern1(int n){  //n = number of lines
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print("*");
            }
            //new line
            System.out.println();
        }
    }
}
