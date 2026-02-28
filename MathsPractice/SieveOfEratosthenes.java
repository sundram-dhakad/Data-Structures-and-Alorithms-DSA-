package MathsPractice;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primeNums = new boolean[n+1];

        //function to print all prime numbers till n
        sieve(n,primeNums);
    }

    //initially the boolean array contains all values as false
    //we are considering that if value at index is false then it is Prime
    static void sieve(int n, boolean[] primes){
        for (int i = 2; i <= n; i++) {
            if (!primes[i]){
                for (int j = i*2; j <=n ; j+=i) {
                    primes[j]=true;
                }
            }
        }
        for (int i = 2; i <=n ; i++) {
            if (!primes[i]){
                System.out.print(i + " ");
            }
        }
    }
}

