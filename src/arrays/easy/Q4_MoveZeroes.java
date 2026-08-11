package arrays.easy;

import java.util.Arrays;

public class Q4_MoveZeroes {

    /*
    Q4 - Move Zeroes

    Pattern / Algorithm:
    - Two Pointers
    - In-place Array Manipulation

    Problem:
    Given an integer array nums, move all 0's to the end while
    maintaining the relative order of the non-zero elements.

    You must do this in-place.

    --------------------------------------------------

    Approach:
    // I have use two pointers

    Time Complexity:
    // O(n) because may be the scenario the array does not have zero

    Space Complexity:
    // nothing

    Edge Cases:
    // You fill
    */

    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;

        while (j < nums.length) {
            if(nums[j]!=0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
            j++;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        Q4_MoveZeroes test = new Q4_MoveZeroes();
        test.moveZeroes(new int[]{0,1,0,3,12});
    }
}