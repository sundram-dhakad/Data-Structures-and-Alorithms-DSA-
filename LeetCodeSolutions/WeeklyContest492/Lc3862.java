package LeetCodeSolutions.WeeklyContest492;

//3862. Find the Smallest Balanced Index
/*
You are given an integer array nums.
An index i is balanced if the sum of elements strictly to the left of i equals the product of elements strictly to the right of i.
If there are no elements to the left, the sum is considered as 0. Similarly, if there are no elements to the right, the product is considered as 1.
Return an integer denoting the smallest balanced index. If no balanced index exists, return -1.
 */

public class Lc3862 {
    public int smallestBalancedIndex(int[] nums) {
        int n = nums.length;

        if(n == 2 && nums[0] == 1) return 1;
        if(n <= 2) return -1;

        //handles situation where i >= 3
        int[] sum = new int[n];
        int[] product = new int[n];

        sum[0] = nums[0];
        for(int i = 1; i<n; i++){
            sum[i] = sum[i-1] + nums[i];
        }

        product[n-1] = nums[n-1];
        for(int i = n-2; i>=0; i--){
            product[i] = product[i+1] * nums[i];
        }

        for(int i = 1; i<n-1; i++){
            if(sum[i-1] == product[i+1]) return i;
        }

        return -1;
    }
}
