package LeetCode.Day2;

import java.util.HashMap;

public class ContainsDuplicate {

    /*
    Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
    Input: nums = [1,2,3,1]
    Output: true
     */

    private static boolean containsDuplicates(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(hm.containsKey(nums[i]))
                return true;
            hm.put(nums[i],i);
        }
        return false;
    }

    public static void main(String args[]) {
        int[] nums = {1,2,3,1};
        System.out.print(containsDuplicates(nums));
    }
}
