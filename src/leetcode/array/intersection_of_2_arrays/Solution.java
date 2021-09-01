package leetcode.array.intersection_of_2_arrays;

import sun.applet.resources.MsgAppletViewer;

import javax.swing.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {61,24,20,58,95,53,17,32,45,85,70,20,83,62,35,89,5,95,12,86,58,77,30,64,46,13,5,92,67,40,20,38,31,18,89,85,7,30,67,34,62,35,47,98,3,41,53,26,66,40,54,44,57,46,70,60,4,63,82,42,65,59,17,98,29,72,1,96,82,66,98,6,92,31,43,81,88,60,10,55,66,82,0,79,11,81};
        int[] nums2 = {5,25,4,39,57,49,93,79,7,8,49,89,2,7,73,88,45,15,34,92,84,38,85,34,16,6,99,0,2,36,68,52,73,50,77,44,61,48};
        System.out.println(Arrays.toString(sol.intersect(nums1, nums2)));
    }
    public int[] intersect(int[] nums1, int[] nums2) {

        int smallerArrLength = Math.min(nums1.length, nums2.length);
        int longerArrLength = Math.max(nums1.length, nums2.length);
        int[] intersection = new int[smallerArrLength];
        int count = 0;

        Map<Integer, Integer> mapNums1 = creatingMapForArr(nums1);
        Map<Integer, Integer> mapNums2 = creatingMapForArr(nums2);
        Map<Integer, Integer> mapNumsTotal = new HashMap<>();

        if (nums1.length == longerArrLength){
            for (int i = 0; i < longerArrLength; i++) {
                if (mapNums1.containsKey(nums1[i]) && mapNums2.containsKey(nums1[i])){
                    mapNumsTotal.put(nums1[i], 1);
                    int count1 = Math.min(mapNums1.get(nums1[i]),mapNums2.get(nums1[i]));
                    mapNumsTotal.replace(nums1[i],count1);
                    System.out.println(mapNumsTotal.toString());
                }
            }



            for (int i = 0; i < smallerArrLength; i++) {
                if (mapNumsTotal.get(nums2[i]) == null){
                    continue;
                }else if (mapNumsTotal.get(nums2[i]) >= 1) {
                    mapNumsTotal.replace(nums2[i], mapNumsTotal.get(nums2[i]) - 1);
                    intersection[count++] = nums2[i];
                }else if (mapNumsTotal.get(nums2[i]) < 1){
                    continue;
                }
            }

        }else{
            for (int i = 0; i < longerArrLength; i++) {
                if (mapNums1.containsKey(nums2[i]) && mapNums2.containsKey(nums2[i])){
                    mapNumsTotal.put(nums2[i], 1);
                    int count1 = Math.min(mapNums1.get(nums2[i]),mapNums2.get(nums2[i]));
                    mapNumsTotal.replace(nums2[i],count1);
                }
            }
            for (int i = 0; i < smallerArrLength; i++) {
                if (mapNumsTotal.get(nums1[i]) == null){
                    continue;
                }else if (mapNumsTotal.get(nums1[i]) >= 1) {
                    mapNumsTotal.replace(nums1[i], mapNumsTotal.get(nums1[i]) - 1);
                    intersection[count++] = nums1[i];
                }else if (mapNumsTotal.get(nums1[i]) < 1){
                    continue;
                }
            }
        }

        int[] intersectionFinal = new int[count];
        for (int i = 0; i < intersectionFinal.length; i++) {
            intersectionFinal[i] = intersection[i];
        }
        return intersectionFinal;
    }
    public Map<Integer, Integer> creatingMapForArr(int[] nums){
        Map<Integer, Integer> sumUp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (sumUp.containsKey(nums[i])){
                sumUp.put(nums[i], sumUp.get(nums[i]) + 1);
            }else{
                sumUp.put(nums[i], 1);
            }

        }
        return sumUp;
    }
}
