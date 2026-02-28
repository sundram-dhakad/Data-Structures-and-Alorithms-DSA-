package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        //System.out.println(digitsSum(13425));
        System.out.println(digitsProduct(1342));
    }

    // sum of digits, for example if n = 1342 then 1+3+4+2 = 10 ans
    static int digitsSum(int n){
        if (n == 0){
            return 0;
        }
        return (n%10) + digitsSum(n/10);
    }

    // Product of digits, for example if n = 1342 then 1*3*4*2 = 24 ans
    static int digitsProduct(int n){
        if (n%10 == n){
            return n;
        }
        return (n%10) * digitsProduct(n/10);
    }

}
