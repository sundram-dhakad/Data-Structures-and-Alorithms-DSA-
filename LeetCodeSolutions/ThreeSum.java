package LeetCodeSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int []arr = {0,0,0,0};
        List<List<Integer>> ans = threeSum(arr);

        for (List<Integer> l : ans){
            System.out.println(l);
        }
    }
    static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length-2; i++) {
            if (i != 0 && nums[i] == nums[i-1] ){
                continue;
            }

            int j = i+1;
            int k = nums.length-1;

            while (j<k){

                int sum = nums[i]+nums[j]+nums[k];

                if (sum>0){
                    k--;
                }
                else if (sum<0) {
                    j++;
                }
                else{
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));

                        while (j<k && nums[k-1]==nums[k]){ k--; }

                        while (j<k && nums[j] == nums[j+1]){ j++; }
                }
            }

        }
        return ans;
    }
}
