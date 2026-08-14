package arrays.easy;

import java.util.Arrays;

public class Q7_RunningSumOf1DArray {

    /*
    Q7 - Running Sum of 1D Array

    Difficulty:
    Easy

    Pattern / Algorithm:
    - Prefix Sum
    - Running Total

    Prerequisites:
    - Array Traversal

    Problem:
    Given an array nums, return the running sum of nums.

    The running sum of an array is defined as:

        runningSum[i] = sum(nums[0]...nums[i])

    Example 1:
    Input: nums = [1,2,3,4]
    Output: [1,3,6,10]

    Example 2:
    Input: nums = [1,1,1,1,1]
    Output: [1,2,3,4,5]

    Constraints:
    - 1 <= nums.length <= 1000
    - -10^6 <= nums[i] <= 10^6

    --------------------------------------------------

    Approach:
    // prefix sum

    Time Complexity:
    // 0(n)

    Space Complexity:
    // O(1)

    Edge Cases:
    // You fill
    */

    public int[] runningSum(int[] nums) {
        int sum = 0;
        int curr = 0;

        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            nums[curr] = sum;
            curr++;
        }
        return nums;
    }

    public static void main(String[] args) {
        Q7_RunningSumOf1DArray test = new Q7_RunningSumOf1DArray();
        System.out.println(Arrays.toString(test.runningSum(new int[]{1,2,3,4})));
    }
}