package LeetCodeSolutions;

//1582. Special Positions in a Binary Matrix
/*
Given an m x n binary matrix mat, return the number of special positions in mat.
A position (i, j) is called special if mat[i][j] == 1 and all other elements in row i and column j are 0 (rows and columns are 0-indexed).
*/
public class Lc1582 {
    public int numSpecial(int[][] mat) {
        int n = mat.length; //rows
        int m = mat[0].length; //columns

        int[] rows = new int[n];
        int[] cols = new int[m];

        //find the no. of 1s in each row and col
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    rows[i]++;
                    cols[j]++;
                }
            }
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1 && rows[i] == 1 && cols[j] == 1) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
