package leetcode.array.two_sum;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 6, 4, 1};
        int target = 6;
        sol.twoSum(nums, target);
    }
    public int[] twoSum(int[] nums, int target) {
        int[] response = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            int x = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (x + nums[j] == target){
                    response = new int[]{i, j};
                }
            }
        }
        System.out.println(Arrays.toString(response));
        return response;
    }
}
