package Recursion.BackTracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 8;
        boolean[][] board = new boolean[n][n];
        System.out.println("Total possible ways : "+queens(board,0));
    }

    static int queens(boolean[][] board, int row){
        if (row == board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        //Checking and placing queens in every column of each row
        for (int col = 0; col < board.length; col++) {
            //place the queen if it is safe to place
            if (isSafe(board, row, col)){
                board[row][col] = true;
                count += queens(board,row+1);
                board[row][col] = false;
            }
        }

        return count;
    }

    static boolean isSafe(boolean[][] board ,int row, int col) {
        //for vertical cells
        for (int i = 0; i < row; i++) {
            if (board[i][col]){
                return false;
            }
        }

        //Now for left diagonal
        int maxLeft = Math.min(row,col);
        for (int i = 1; i <= maxLeft ; i++) {
            if (board[row-i][col-i]){
               return false;
            }
        }

        //Now check for right side diagonal
        int maxRight = Math.min( row , board.length-1-col);
        for (int i = 1; i <= maxRight ; i++) {
            if (board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }

    static void display(boolean[][] board) {
        for (boolean[] row : board){
            for (boolean element : row){
                if (element){
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
