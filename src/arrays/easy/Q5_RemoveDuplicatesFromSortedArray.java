package arrays.easy;

import java.util.Arrays;

public class Q5_RemoveDuplicatesFromSortedArray {

    /*
    Q5 - Remove Duplicates from Sorted Array

    Difficulty:
    Easy

    Pattern / Algorithm:
    - Two Pointers
    - In-place Array Manipulation

    Prerequisites:
    - Array Traversal
    - Two Pointer Technique

    Problem:
    Given a sorted integer array nums, remove the duplicates in-place such that
    each unique element appears only once.

    The relative order of the elements should be kept the same.

    Return the number of unique elements (k).

    The first k elements of nums should contain the unique elements.
    The remaining elements beyond k do not matter.

    Example 1:
    Input: nums = [1,1,2]
    Output: 2
    Modified Array: [1,2,_]

    Example 2:
    Input: nums = [0,0,1,1,1,2,2,3,3,4]
    Output: 5
    Modified Array: [0,1,2,3,4,_,_,_,_,_]

    Constraints:
    - 1 <= nums.length <= 3 * 10^4
    - -100 <= nums[i] <= 100
    - nums is sorted in non-decreasing order.

    --------------------------------------------------

    Approach:
    // You fill

    Time Complexity:
    // You fill

    Space Complexity:
    // You fill

    Edge Cases:
    // You fill
    */

    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;

        while (j < nums.length) {
           if (nums[j] == nums[i]) {
               j++;
           }else  {
               nums[i+1] = nums[j];
               i++;
               j++;
           }
        }
        System.out.println(Arrays.toString(nums));
        return 0;
    }

    public static void main(String[] args) {
        Q5_RemoveDuplicatesFromSortedArray test = new Q5_RemoveDuplicatesFromSortedArray();
        test.removeDuplicates(new int[]{1, 1, 1, 2, 2, 3});
    }
}