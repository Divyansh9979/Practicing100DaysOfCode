package LeetCode.Day2;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    /*
    Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
    Input: nums = [1,2,3,4]
    Output: [24,12,8,6]
     */

    private static int[] productOfArrayExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++) {
            int product = 1;
            for(int j=0;j<n;j++) {
                if(i==j) continue;
                product *= nums[j];
            }
            ans[i] = product;
        }
        return ans;
    }

    public static void main(String args[]) {
        int nums[] = {1,2,3,4};
        System.out.print(Arrays.toString(productOfArrayExceptSelf(nums)));
    }
}
