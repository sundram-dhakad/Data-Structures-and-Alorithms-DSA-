package Recursion;

public class ReverseNum {
    public static void main(String[] args) {
        revNum(1824);
       // System.out.println(sum);
        System.out.println(revNum2(1234));
    }

    //1st way of reversing a number :
    //(Not the best way in terms of recursion's pov because we are declaring variable outside the function)
    static int sum = 0;
    static void revNum(int n){
        if (n == 0){
            return ;
        }
        sum = sum*10 + (n%10);
        revNum(n/10);
    }

    //2nd way of reversing number
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
