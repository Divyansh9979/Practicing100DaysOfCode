package LeetCode.Day1;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    /*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     */

    //Solution 1
    private static int[] returnIndicesWithSumTarget(int[] nums,int target) {
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if(nums[i]+nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    //Solution 2
    private static int[] returnIndicesWithSumTargetOptimised(int[] nums,int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int difference = target - nums[i];
            if (hm.containsKey(difference)) {
                return new int[] {
                        hm.get(difference),i
                };
            }
            hm.put(nums[i],i);
        }
        throw new IllegalArgumentException("No Sum Found");
    }

    public static void main(String args[]) {
        int nums[] = {1,2,3,7,11};
        int target = 10;
        System.out.println(Arrays.toString(returnIndicesWithSumTarget(nums,target)));
        System.out.print(Arrays.toString(returnIndicesWithSumTargetOptimised(nums,target)));
    }
}
