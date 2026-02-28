package Recursion;

public class NoOfZeroes {
    public static void main(String[] args) {
        System.out.println(zeroes(3020400));
    }
    static int zeroes(int n){
        return helper(n,0);
    }
    static int helper(int n, int c){
        if (n==0){
            return c;
        }
        if (n%10 == 0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }
}
