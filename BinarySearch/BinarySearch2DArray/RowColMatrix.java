package BinarySearch.BinarySearch2DArray;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][]arr = {
                {10,20,30,40,55},
                {15,25,35,45,60},
                {28,29,37,49,65},
                {32,34,38,50,70}
        };
        System.out.println(Arrays.toString(findInRowColMatrix(arr,65)));
    }
    static int[] findInRowColMatrix(int[][] matrix, int target){
        int r = 0;
        int c = matrix[r].length-1;

        while (r< matrix.length && c>=0){
            if (target == matrix[r][c]){
                return new int[]{r,c};
            }
            if (target<matrix[r][c]){
                c--;
            }else {
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
