package LeetCodeSolutions;
import java.util.*;

//Given an integer n, return the number of prime numbers that are strictly less than n
//Solved this problem using "Sieve of Eratosthenes" method.

public class CountPrimes {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(countPrimes(10));
    }

    static int countPrimes(int n) {
        if (n <= 2)
            return 0;

        int[] primes = new int[n];
        Arrays.fill(primes, 1);

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (primes[i] == 1) {
                for (int j = i * i; j < n; j += i) {
                    primes[j] = 0;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (primes[i] == 1)
                count++;
        }

        return count;
    }
}
