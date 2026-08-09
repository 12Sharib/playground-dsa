package arrays.easy;

public class Q1_FindLargestElement {
/*
    Given an integer array nums, return the largest element present in the array.

    Example 1:
    Input: [2,5,1,3,0]
    Output: 5

    Example 2:
    Input: [-5,-2,-10,-1]
    Output: -1
 */
    private int findLargestElement(int[] nums) {
        if (nums == null || nums.length== 0){
            return -1;
        }

        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Q1_FindLargestElement q = new Q1_FindLargestElement();
        int ans = q.findLargestElement(new int[]{3, 2, 1, 5, 6, 4});
        System.out.println(ans);

    }
}
