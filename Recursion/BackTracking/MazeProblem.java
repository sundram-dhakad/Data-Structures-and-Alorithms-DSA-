package Recursion.BackTracking;

import java.util.ArrayList;

public class MazeProblem {
    public static void main(String[] args) {
       // System.out.println(countPaths(3,3));
       // printPaths("",3,3);
       // System.out.println(printPathsRet("",3,3));
       // System.out.println(printPathsRetD("",3,3));

        //true means we can go through it and false means we cant go through it
        boolean [][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        printPathsObstacles("",maze,0,0);
    }

    //Returning the count of number of ways to reach destination
    static int countPaths(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }

        int left = countPaths(r-1,c);
        int right = countPaths(r,c-1);

        return left+right;
    }

    //Printing path
    //There are only two moves available : Right(R) and Down(D)
    static void printPaths(String p , int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if (r == 1){
            printPaths(p+"R",r,c-1);
        }
        else if (c == 1){
            printPaths(p+"D",r-1,c);
        }
        else {
            printPaths(p+"D",r-1,c);
            printPaths(p+"R",r,c-1);
        }
    }

    //Returning An ArrayList containing all the paths
    static ArrayList<String> printPathsRet(String p , int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }

        ArrayList<String> ans = new ArrayList<>();

        if (r > 1){
            ans.addAll(printPathsRet(p+"D",r-1,c));
        }

        if (c > 1){
            ans.addAll(printPathsRet(p+"R",r,c-1));
        }

        return ans;
    }

    //Returning all the possible paths, considering we can move Diagonally also
    //Denoting "V" => Vertical, "H" => Horizontal and "D" => Diagonal
    static ArrayList<String> printPathsRetD(String p , int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }

        ArrayList<String> ans = new ArrayList<>();

        if (r == c) {
            ans.addAll(printPathsRetD(p + "D", r - 1, c - 1));
        }

        if (r > 1) {
            ans.addAll(printPathsRetD(p + "V", r - 1, c));
        }

        if (c > 1) {
            ans.addAll(printPathsRetD(p + "H", r, c - 1));
        }

        return ans;
    }

    //Matrix with Obstacles
    //also we are going here from 0,0 to destination
    static void printPathsObstacles(String p , boolean[][] maze, int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if (!maze[r][c]){
            return;
        }

        if (r < maze.length-1){
            printPathsObstacles(p+"D",maze,r+1,c);
        }

        if (c < maze[0].length-1){
            printPathsObstacles(p+"R",maze,r,c+1);
        }
    }

}
