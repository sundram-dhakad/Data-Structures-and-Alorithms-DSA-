package LeetCodeSolutions;

//3418. Maximum Amount of Money Robot Can Earn
public class Lc3418 {
    int n, m;
    Integer[][][] dp;

    public int maximumAmount(int[][] coins) {
        n = coins.length;
        m = coins[0].length;
        dp = new Integer[n][m][3];

        return solve(coins, 0, 0, 0);
    }

    private int solve(int[][] coins, int i, int j, int k) {
        if (i >= n || j >= m)
            return Integer.MIN_VALUE;

        if (i == n - 1 && j == m - 1) {
            if (coins[i][j] < 0 && k < 2)
                return 0;
            return coins[i][j];
        }

        if (dp[i][j][k] != null)
            return dp[i][j][k];

        int val = coins[i][j];

        int res = Integer.MIN_VALUE;

        //move right
        if (j + 1 < m) {
            //take
            res = Math.max(res, val + solve(coins, i, j + 1, k));

            //skip robber
            if (val < 0 && k < 2) {
                res = Math.max(res, solve(coins, i, j + 1, k + 1));
            }
        }

        if (i + 1 < n) {
            res = res = Math.max(res, val + solve(coins, i + 1, j, k));

            if (val < 0 && k < 2) {
                res = Math.max(res, solve(coins, i + 1, j, k + 1));
            }
        }

        return dp[i][j][k] = res;
    }
}
