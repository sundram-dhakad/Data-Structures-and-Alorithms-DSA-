package BinarySearch.BinarySearch2DArray;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][]matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(matrix,6)));
    }
    static int[] binarySearch(int[][]matrix,int row,int cStart, int cEnd ,int target){
        while (cStart<=cEnd){
            int mid = cStart + (cEnd-cStart)/2;

            if (matrix[row][mid] == target) {
                return new int[]{row,mid};
            }
            if (matrix[row][mid] < target){
                cStart = mid+1;
            }else {
                cEnd = mid-1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][]matrix ,int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (cols == 0){
            return new int[]{-1,-1};
        }
        if (rows == 1){
           return binarySearch(matrix,0,0,cols-1,target);
        }

        int rStart = 0;
        int rEnd = rows-1;
        int cMid = cols/2;

        //Run the loop till two rows are only left
        while (rStart < rEnd-1){ //While this is true it will have more than two rows
            int rMid = rStart + (rEnd-rStart)/2;

            if (matrix[rMid][cMid]==target){
                return new int[]{rMid,cMid};
            }
            if (matrix[rMid][cMid]<target){
                rStart = rMid;
            }else {
                rEnd = rMid;
            }
        }

        //Now we have two rows
        //Check whether the target is within the col of two rows
        if (matrix[rStart][cMid] == target){
            return new int[]{rStart,cMid};
        }
        if (matrix[rStart+1][cMid] == target){
            return new int[]{rStart+1,cMid};
        }

        //Now check in four halves
        //check in first half
        if (target <= matrix[rStart][cMid-1]){
            return binarySearch(matrix,rStart,0,cMid-1,target);
        }
        //check in second half
        if (target >= matrix[rStart][cMid+1] && target <= matrix[rStart][cols-1]){
            return binarySearch(matrix,rStart,cMid+1,cols-1,target);
        }
        //check in third half
        if (target <= matrix[rStart+1][cMid-1]){
            return binarySearch(matrix,rStart+1,0,cMid-1,target);
        }
        //check in fourth half
        else {
            return binarySearch(matrix,rStart+1,cMid+1,cols-1,target);
        }
    }
}
