package MathsPractice;

import java.util.Arrays;

public class FlipInvertedI {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0}, // flipped => [0,1,1] then Inverted => [1,0,0]
                {1,0,1}, //[1,0,1] => [0,1,0]
                {0,0,0}  //[0,0,0] => [1,1,1]
        } ;
        int[][] ans = flipInvertedImage(arr);
        for (int[] row : ans){
            System.out.println(Arrays.toString(row));
        }
    }
    static int[][] flipInvertedImage(int[][] arr){
        int[][] image = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <= (arr[i].length / 2); j++) {
                image[i][j] = 1^(arr[i][arr.length-1-j]);  // ^ means XOR
                image[i][arr.length-1-j] = 1^(arr[i][j]);
            }
        }
        return image;
    }
}
