package HackerRankSolutions;
import java.util.*;

public class CoinChangeProblem {
    public static long getWays(int n, List<Long> c) {
        // Write your code here
        long[] dp = new long[n+1];
        dp[0] = 1;

        for(long coin : c){
            for(int i = (int)coin; i<=n; i++){
                dp[i] += dp[i - (int)coin];
            }
        }

        return dp[n];
    }
}
