package LeetCodeSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] arr = {1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;

        List<List<Integer>> result = fourSum(arr, target);
        for (List<Integer> l : result) {
            System.out.println(l);
        }
    }

    static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int k = j + 1;
                int l = nums.length - 1;

                while (k < l) {
                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[k] + (long) nums[l];

                    if (sum < target) {
                        k++;
                    }
                    else if (sum > target) {
                        l--;
                    }
                    else {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));

                        while (k < l && nums[k] == nums[k + 1]) k++;
                        k++;

                        while (k < l && nums[l] == nums[l - 1]) l--;
                        l--;
                    }

                }
            }
        }
        return ans;
    }
}
