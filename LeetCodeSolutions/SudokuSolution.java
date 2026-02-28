package LeetCodeSolutions;

public class SudokuSolution {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        solveSudoku(board);
        for(char[] row : board) {
            for(char num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }


    static void solveSudoku(char[][] board) {
        solve(board);
    }

    static boolean solve(char[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.'){
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
            if (isSafe(board,row,col, (char)(number + '0'))){
                board[row][col] = (char) (number + '0');
                if (solve(board)){
                    //found the ans
                    return true;
                }
                else {
                    //else backtrack
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }

    private static boolean isSafe(char[][] board, int row, int col, char number) {
        //let's check in row
        for (int i = 0; i < board.length; i++) {
            //check the number in whole row
            if (board[row][i] == number){
                return false;
            }
        }

        //let's check in column
        for (char[] chars : board) {
            if (chars[col] == number) {
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
}
