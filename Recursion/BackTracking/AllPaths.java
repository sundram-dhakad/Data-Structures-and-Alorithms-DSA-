package Recursion.BackTracking;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        //true means we can go through it and false means we cant go through it
        boolean [][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

       // printAllPaths("",maze,0,0);

        int[][] paths = new int[maze.length][maze[0].length];
        printAllPathsMatrix("",maze,0,0,paths,1);
    }

    static void printAllPaths(String p, boolean[][] maze, int r, int c) {
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if (!maze[r][c]){
            return;
        }

        maze[r][c] = false;

        if (r < maze.length-1){
            printAllPaths(p+"D",maze,r+1,c);
        }

        if (c < maze[0].length-1){
            printAllPaths(p+"R",maze,r,c+1);
        }

        if (r > 0){
            printAllPaths(p+"U",maze,r-1,c);
        }

        if (c > 0){
            printAllPaths(p+"L",maze,r,c-1);
        }

        maze[r][c] = true;
    }

    static void printAllPathsMatrix(String p, boolean[][] maze, int r, int c, int[][]path , int step) {
        if(r == maze.length-1 && c == maze[0].length-1){
            path[r][c] = step;
            for (int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]){
            return;
        }

        maze[r][c] = false;
        path[r][c] = step;

        if (r < maze.length-1){
            printAllPathsMatrix(p+"D",maze,r+1,c,path,step+1);
        }

        if (c < maze[0].length-1){
            printAllPathsMatrix(p+"R",maze,r,c+1, path, step+1);
        }

        if (r > 0){
            printAllPathsMatrix(p+"U",maze,r-1,c , path, step+1);
        }

        if (c > 0){
            printAllPathsMatrix(p+"L",maze,r,c-1, path, step+1);
        }

        maze[r][c] = true;
        path[r][c] = 0;
    }
}
