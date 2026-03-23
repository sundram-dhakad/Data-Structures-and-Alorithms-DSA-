package LeetCodeSolutions;
import java.util.*;

//Leetcode 1594. Maximum Non Negative Product in a Matrix
public class Lc1594 {
    List<List<HashMap<Long, Long>>> dp = new ArrayList<>();

    public int maxProductPath(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        for (int i = 0; i <= n; i++) {
            dp.add(new ArrayList<HashMap<Long, Long>>());
            for (int j = 0; j <= m; j++) {
                dp.get(i).add(new HashMap<Long, Long>()); //for each i,j - a hashmap
            }
        }

        long result = solve(grid, 0, 0, 1);

        if (result < 0)
            return -1;
        return (int) (result % 1000000007);
    }

    private long solve(int[][] grid, int i, int j, long curr) {
        if (i == grid.length - 1 && j == grid[0].length - 1) {
            return curr * grid[i][j];
        }

        if (dp.get(i).get(j).containsKey(curr))
            return dp.get(i).get(j).get(curr);

        long right = Long.MIN_VALUE;
        long down = Long.MIN_VALUE;

        if (j < grid[0].length - 1) {
            right = solve(grid, i, j + 1, curr * grid[i][j]);
        }
        if (i < grid.length - 1) {
            down = solve(grid, i + 1, j, curr * grid[i][j]);
        }

        Long max = Math.max(right, down);
        dp.get(i).get(j).put(curr, max);
        return max;
    }
}
