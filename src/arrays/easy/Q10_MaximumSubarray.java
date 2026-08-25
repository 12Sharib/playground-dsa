package arrays.easy;

public class Q10_MaximumSubarray {

    /*
    Q10 - Maximum Subarray

    Difficulty:
    Medium

    Problem:

    Given an integer array nums, find the contiguous subarray
    (containing at least one number) which has the largest sum.

    Return the maximum sum.

    --------------------------------------------------

    Example 1:

    Input:
    nums = [-2,1,-3,4,-1,2,1,-5,4]

    Output:
    6

    Explanation:
    The subarray [4,-1,2,1] has the largest sum.

    --------------------------------------------------

    Example 2:

    Input:
    nums = [1]

    Output:
    1

    --------------------------------------------------

    Example 3:

    Input:
    nums = [5,4,-1,7,8]

    Output:
    23

    --------------------------------------------------

    Constraints:

    1 <= nums.length <= 100000

    -10^4 <= nums[i] <= 10^4

    --------------------------------------------------

    Follow-up:

    Can you solve it in O(n) time?

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

    public int maxSubArray(int[] nums) {
        int current=0;
        int maxSum = Integer.MIN_VALUE;
//        [-2,1,-3,4,-1,2,1,-5,4]
        int sum=0;

        while (current < nums.length){
            sum +=nums[current];
            maxSum = Math.max(maxSum, sum);
            if (sum < 0){
                sum=0;
            }
            current++;
        }
        System.out.println(maxSum);
        return 0;
    }

    public static void main(String[] args) {
        Q10_MaximumSubarray q = new Q10_MaximumSubarray();
        q.maxSubArray(new int[]{5,4,-1,7,8});
    }
}