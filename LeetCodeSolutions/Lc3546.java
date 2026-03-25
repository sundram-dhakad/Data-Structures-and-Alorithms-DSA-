package LeetCodeSolutions;

//LeetCode 3546. Equal Sum Grid Partition I
public class Lc3546 {
    public static void main(String[] args) {
        int[][] grid = {{42047},{57775},{99822}};
        System.out.println(canPartitionGrid(grid));
    }

    static boolean canPartitionGrid(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        long[] upper = new long[n];
        for (int i = 0; i < n - 1; i++) {
            long sum = (i > 0) ? upper[i-1] : 0;
            for (int j = 0; j < m; j++) {
                sum += grid[i][j];
            }
            upper[i] = sum;
        }

        long lower = 0;
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < m; j++) {
                lower += grid[i][j];
            }
            if (lower == upper[i - 1])
                return true;
            if (lower > upper[i - 1])
                break;
        }

        long[] left = new long[m];
        for (int j = 0; j < m - 1; j++) {
            long sum = (j > 0) ? left[j - 1] : 0;
            for (int i = 0; i < n; i++) {
                sum += grid[i][j];
            }
            left[j] = sum;
        }

        long right = 0;
        for (int j = m - 1; j > 0; j--) {
            for (int i = 0; i < n; i++) {
                right += grid[i][j];
            }
            if (right == left[j - 1])
                return true;
            if (right > left[j - 1])
                break;
        }

        return false;
    }
}
