package LeetCodeSolutions;
//problem no. 1 : https://leetcode.com/problems/two-sum/description/

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[]nums = {3,3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums,target)));

    }
    static int[] twoSum(int[]nums, int target){

        for (int i = 0; i < nums.length-1; i++) {
            for (int j =i+1; j < nums.length ; j++) {
                int sum = nums[i]+nums[j];
                if(sum == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
