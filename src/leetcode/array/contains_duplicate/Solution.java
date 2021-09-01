package leetcode.array.contains_duplicate;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 6, 2};
        System.out.println(sol.containsDuplicate(nums));
        sol.containsDuplicate(nums);
    }
    public boolean containsDuplicate(int[] nums) {
        int count = 0;
        int temp;
        while (count < nums.length){
            temp = nums[count++];
            for (int i = count; i < nums.length; i++) {
                if (temp == nums[i]){
                    return true;
                }

            }

        }
        return false;
    }
}
