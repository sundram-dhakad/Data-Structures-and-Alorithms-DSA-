package Recursion;

public class RecursionEx {
    public static void main(String[] args) {
        System.out.println(fibo(5));
        //System.out.println(factorial(5));
    }

    //Recursive function to print nth term of fibonacci series
    //Each term is obtained by adding previous two terms : 0,1,1,2,3,5,8,13.....
    //Let n = 6, then answer = 8, which is equal to 5th term(3) + 4th term(2)
    static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        else {
            return fibo(n-1)+fibo(n-2);
        }
    }

    //Calculate Factorial of a given num
    //Let n = 5, then factorial => 5*4*3*2*1 = 120
    static int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
}
