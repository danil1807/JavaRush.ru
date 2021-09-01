package leetcode.array.plus_one;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] digits = {9};
        System.out.println(Arrays.toString(sol.plusOne(digits)));
    }

    private int count = 1;

    public int[] plusOne(int[] digits) {
        int[] digits2 = new int[digits.length + 1];

        int iterator = digits.length - count;

        if (iterator >= 0){
            if (digits[iterator] < 9){
                digits[iterator] = digits[iterator] + 1;
                return digits;
            } else{
                digits[iterator] = 0;
                count++;
                return plusOne(digits);
            }
        } else {
            digits2[0] = 1;
            digits[0] = 0;
            System.arraycopy(digits, 0, digits2, 1, digits2.length - 1);
            return digits2;
        }
    }
}
