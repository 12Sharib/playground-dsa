package arrays.easy;

import java.util.Arrays;

public class Q6_RemoveElement {

    /*
    Q6 - Remove Element

    Difficulty:
    Easy

    Pattern / Algorithm:
    - Two Pointers
    - In-place Array Manipulation

    Prerequisites:
    - Array Traversal
    - Two Pointer Technique

    Problem:
    Given an integer array nums and an integer val, remove all occurrences
    of val in-place.

    The order of the elements may be changed.

    Return the number of elements that are not equal to val.

    The first k elements of nums should contain the elements
    that are not equal to val.

    Example 1:
    Input:
    nums = [3,2,2,3], val = 3

    Output:
    2

    Modified Array:
    [2,2,_,_]

    --------------------------------------------------

    Example 2:

    Input:
    nums = [0,1,2,2,3,0,4,2], val = 2

    Output:
    5

    Modified Array:
    [0,1,4,0,3,_,_,_]

    Constraints:
    - 0 <= nums.length <= 100
    - 0 <= nums[i] <= 50
    - 0 <= val <= 100

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

    public int removeElement(int[] nums, int val) {
        int i =0;
        int j = 0;

        while(j<nums.length){
            if (nums[j] != val){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
        System.out.println(Arrays.toString(nums));

        return 0;
    }

    public static void main(String[] args) {
        Q6_RemoveElement test = new Q6_RemoveElement();
        test.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);
    }
}