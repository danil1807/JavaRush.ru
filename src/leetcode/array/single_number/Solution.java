package leetcode.array.single_number;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2,4,4,10,3,2,3,6,6};
        int[] nums1 = {1,0,1};
        System.out.println(sol.singleNumber(nums1));

    }
    public int singleNumber(int[] nums) {
        int single = nums[0];
        Integer[] duplicates = new Integer[nums.length/2 + 1];
        int countPositionForDoubleCheck = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if(neverCheckedBefore(nums[i], duplicates)){
                for (int j = i + 1; j < nums.length; j++) {
                    if (single == nums[j]){
                        duplicates[countPositionForDoubleCheck++] = single;
                        single = nums[i + 1];
                        break;
                    }
                    else if (j == nums.length - 1){
                        return single;
                    }
                }
            } else{
                single = nums[i + 1];
            }
        }
        return single;
    }

    private boolean neverCheckedBefore(int number, Integer[] doubleCheck) {
        try {
            for (int i = 0; i < doubleCheck.length; i++) {
                if (number == doubleCheck[i]) {
                    return false;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("was null");
        }
        return true;
    }
}
