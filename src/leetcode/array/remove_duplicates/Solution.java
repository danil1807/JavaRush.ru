package leetcode.array.remove_duplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

    // Input array
//    int[] expectedNums = [...]; // The expected answer with correct length
//
//    int k = removeDuplicates(nums); // Calls your implementation
//
//    assert k == expectedNums.length;
//    for (int i = 0; i < k; i++) {
//        assert nums[i] == expectedNums[i];
//    }
public static void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = {1, 1, 2};
    System.out.println(solution.removeDuplicates1(nums));

}




    public int removeDuplicates1(int[] nums) {
        int size = nums.length;
        int index2 = 0;
        int temp;
        int count = 0;
        int[] numbers = new int[size];

        if (size == 1){
            numbers = nums;
            count++;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]){
                numbers[index2] = nums[i];
                index2++;
                count++;
                temp = nums[i + 1];
                if (i == size - 2){
                    numbers[index2] = temp;
                    count++;
                }
            } else{
                temp = nums[i + 1];
                if (i == size - 2){
                    numbers[index2] = temp;
                    count++;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
        return count;
    }

}
