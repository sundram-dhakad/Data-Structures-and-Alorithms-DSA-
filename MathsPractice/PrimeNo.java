package MathsPractice;

public class PrimeNo {
    public static void main(String[] args) {
        System.out.println(isPrime(25));
    }

    //Prime Number :
    //A number that is divisible by only 1 and itself is known as prime number
    //1 is not considered a prime number. By definition, a prime number has exactly two distinct positive divisors: 1 and the number itself.
    //Since 1 only has one divisor (1), it does not meet this requirement, so it is not classified as prime.
    //The smallest prime number is 2.
    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        int c = 2;
        while(c*c <= n){
            if (n%c == 0){
             return false;
            }
            c++;
        }
        return true;
    }
}
