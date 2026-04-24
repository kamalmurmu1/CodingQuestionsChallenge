package LeetCode.minimumoperations;
//https://leetcode.com/problems/minimum-operations-to-make-array-sum-divisible-by-k/
public class MinOperations {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum % k;
    }

    public static void main(String[] args) {
        MinOperations minOperations = new MinOperations();
        System.out.println(minOperations.minOperations(new int[]{3 , 9, 7}, 5));
        System.out.println(minOperations.minOperations(new int[]{4,1,3}, 4));
    }
}
