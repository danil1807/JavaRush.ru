package leetcode.array.rotate_array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};
        Solution solution = new Solution();
        solution.rotate2(nums, 3);
    }
    public int[] rotate(int[] nums, int k) {
        int[] replacedInts = new int[nums.length];
        int j = 0;
        for (int i = nums.length-k; i < nums.length; i++) {
            replacedInts[j++] = nums[i];
        }
        for (int i = 0; i < nums.length - k; i++) {
            replacedInts[j++] = nums[i];
        }
        System.out.println(Arrays.toString(replacedInts));
        return replacedInts;
    }
    public void rotate2(int[] nums, int k) {
        int temp;
        int count = 0;
        while(count < k){
            temp = nums[nums.length-1];
            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = temp;
            count++;
        }
        System.out.println(Arrays.toString(nums));
    }
    //not finished

    public void rotate3(int[] nums, int k){
        int temp;
        for (int i = 0; i < nums.length; i++) {
            temp = nums[i + k];
            nums[i + k] = nums[i];
        }
    }
}
