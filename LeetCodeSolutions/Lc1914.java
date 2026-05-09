package LeetCodeSolutions;
import java.util.*;

//LeetCode 1914 : Cyclically Rotating a Grid
public class Lc1914 {
    public static void main(String[] args) {
        int[][] grid = {
                {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}
        };
        int k = 2;

        rotateGrid(grid,k);

        for (int[] row : grid) {
            System.out.println(Arrays.toString(row));
        }
    }
    static int[][] rotateGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;

        for (int i = 0; i < Math.min(n, m) / 2; i++) {
            List<Integer> list = new ArrayList<>();

            //step1 : flatten the layer
            //right to left
            for (int j = i; j < m - i; j++) {
                list.add(grid[i][j]);
            }

            //top to bottom
            for (int j = i + 1; j < n - i; j++) {
                list.add(grid[j][m - i - 1]);
            }

            //left to right
            for (int j = m - i - 2; j >= i; j--) {
                list.add(grid[n - i - 1][j]);
            }

            //bottom to top
            for (int j = n - i - 2; j > i; j--) {
                list.add(grid[j][i]);
            }

            //step2 : rotate the layer
            rotate(list, k);

            //step3 : fill the layer back in grid
            int index = 0;
            //right to left
            for (int j = i; j < m - i; j++) {
                grid[i][j] = list.get(index);
                index++;
            }

            //top to bottom
            for (int j = i + 1; j < n - i; j++) {
                grid[j][m - i - 1] = list.get(index);
                index++;
            }

            //left to right
            for (int j = m - i - 2; j >= i; j--) {
                grid[n - i - 1][j] = list.get(index);
                index++;
            }

            //bottom to top
            for (int j = n - i - 2; j > i; j--) {
                grid[j][i] = list.get(index);
                index++;
            }

        }

        return grid;
    }

    static void rotate(List<Integer> list, int k) {
        int l = list.size();
        k = k % l;
        reverse(list, 0, l - 1);
        reverse(list, 0, l - k - 1);
        reverse(list, l - k, l - 1);
    }

    static void reverse(List<Integer> list, int s, int e) {
        while (s < e) {
            int temp = list.get(s);
            list.set(s, list.get(e));
            list.set(e, temp);
            s++;
            e--;
        }
    }
}
