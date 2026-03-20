package HackerRankSolutions;
import java.util.*;

public class GreedyFlorist {
    // Complete the getMinimumCost function below.
    static int getMinimumCost(int k, int[] c) {
        Arrays.sort(c);

        int cost = 0;
        int n = c.length;

        for(int i = 0; i < n; i++){
            int price = c[n - 1 - i];
            cost += (i / k + 1) * price;
        }

        return cost;
    }
}
