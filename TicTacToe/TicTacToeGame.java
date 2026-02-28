package TicTacToe;

import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        char [][] board = new char[3][3];

        //let's initialize the board as empty containing ' '
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                board[row][col] = ' ';
            }
        }

        boolean gameOver = false;
        char player = 'X';
        Scanner sc = new Scanner(System.in);

        System.out.println("To enter Input at particular position enter row and column for that position. \n Best Of Luck :) \n");

        while (!gameOver){
            printBoard(board);
            System.out.print("Player "+player+ " enter : ");
            int row = sc.nextInt();
            int col = sc.nextInt();
            System.out.println();

            if(board[row][col] == ' '){
                board[row][col] = player; //place the player's move
                gameOver = hasWon(board,player);
                if(gameOver){



                    
                    //if game over player has won
                    System.out.println("Player " +player+ " has Won ");
                }else {
                    //Change the player for next move
                    player = (player == 'X') ? 'O' : 'X';
                }
            }
            else {
                System.out.println("Invalid Move !! Try Again ");
            }
        }
        printBoard(board);
    }

    public static boolean hasWon(char[][]board, char player){
        //Check for rows
        for(int row = 0; row<board.length; row++){
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player){
                return true;
            }
        }

        //Check for columns
        for (int col = 0; col < board.length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player){
                return true;
            }
        }

        //Check for Diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;
        }

        return false;
    }

    public static void printBoard(char [][] board){
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                System.out.print(board[row][col]+" | ");
            }
            System.out.println();
        }
    }
}
