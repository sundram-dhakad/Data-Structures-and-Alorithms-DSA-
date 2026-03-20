package HackerRankSolutions;
import java.util.*;

public class Candies {
    public static long candies(int n, List<Integer> arr) {
        // Write your code here
        if (n == 1)
            return 1;

        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        for (int i = 1; i < n; i++) {
            if (arr.get(i) > arr.get(i - 1)) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (arr.get(i) > arr.get(i+1)) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        long total = 0;
        for(int c : candies) total += c;

        return total;
    }
}
