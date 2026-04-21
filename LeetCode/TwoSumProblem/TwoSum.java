package LeetCode.TwoSumProblem;

import java.util.Arrays;

/*https://leetcode.com/problems/two-sum/ :  Completed*/
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int r1 = 0, r2 = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    r1 = i;
                    r2 = j;
                    break;
                }
            }
            if (r1 + r2 != 0) {
                break;
            }
        }
        return new int[]{r1, r2};
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
