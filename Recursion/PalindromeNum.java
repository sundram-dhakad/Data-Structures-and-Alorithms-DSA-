package Recursion;

public class PalindromeNum {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }


    static boolean isPalindrome(int n){
        return (n == revNum2(n));
    }

    //Function to reverse a number
    static int revNum2(int n){
        //calculate digits of n
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n,digits);
    }
    //helper function for revNum2()
    static int helper(int n, int digits){
        if (n%10 == n){
            return n;
        }
        return (int)((n%10) * (Math.pow(10,digits-1)) + helper(n/10, digits-1));
    }
}
