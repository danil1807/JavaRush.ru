package leetcode.string.reverse_string;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] s = {'h','e','l','l','o'};
        solution.reverseString(s);

    }

    public void reverseString1(char[] s) {
        int arrSize = s.length;
        char[] reverseArr = new char[arrSize];
        for (int i = 0; i < s.length; i++) {
            reverseArr[--arrSize] = s[i];
        }
        System.out.println(Arrays.toString(reverseArr));
    }

    public void reverseString(char[] s) {
        char temp;
        int cycles = s.length/2 - 1;
        int index = s.length - 1;
        for (int i = 0; i <= cycles; i++) {
            temp = s[i];
            s[i] = s[index];
            s[index--] = temp;
        }
        System.out.println(Arrays.toString(s));
    }

}
