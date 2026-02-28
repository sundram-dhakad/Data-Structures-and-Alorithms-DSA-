package Recursion.BackTracking;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (solve(board)){
            display(board);
        }else {
            System.out.println("Could not solve ! ");
        }

    }
    static boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0){
                    row = i;
                    col = j;
                    emptyLeft = true;
                    break;
                }
            }
            if (emptyLeft){
                break;
            }
        }

        if (!emptyLeft){
            return true;
        }

        for (int number = 1; number <=9 ; number++) {
            if (isSafe(board,row,col,number)){
                board[row][col] = number;
                if (solve(board)){
                    //found the ans
                    return true;
                }
                else {
                    //else backtrack
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col, int number) {
        //let's check in row
        for (int i = 0; i < board.length; i++) {
            //check the number in whole row
            if (board[row][i] == number){
                return false;
            }
        }

        //let's check in column
        for (int[] r : board){
            if (r[col] == number){
               return false;
            }
        }

        //Now let's check in the box
        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row%sqrt;
        int colStart = col - col%sqrt;

        for (int i = rowStart; i < rowStart + sqrt ; i++) {
            for (int j = colStart; j < colStart + sqrt ; j++) {
                if (board[i][j] == number){
                    return false;
                }
            }
        }

        return true;
    }

    private static void display(int[][] board) {
        for(int[] row : board) {
            for(int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

}
