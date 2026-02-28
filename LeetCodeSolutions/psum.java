package LeetCodeSolutions;

//Problem no. 303  :  https://leetcode.com/problems/range-sum-query-immutable/description/

class NumArray {
    private int[] pSum;

    public NumArray(int[] nums) {
        pSum = new int[nums.length];
        pSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            pSum[i] += nums[i]+pSum[i-1];
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0){
            return pSum[right];
        }
        return pSum[right]-pSum[left-1];
    }
}

public class psum {
    public static void main(String[] args) {
        int []arr = {1,2,5,4,8,10};
        NumArray a = new NumArray(arr);
        System.out.println(a.sumRange(2,4));
    }
}
