package arrays.medium;

import java.util.Arrays;

public class Q13_TrappingRainWater {

    /*
    Q13 - Trapping Rain Water

    Difficulty:
    Medium

    Problem:

    Given n non-negative integers representing an elevation map
    where the width of each bar is 1, compute how much water
    it can trap after raining.

    --------------------------------------------------

    Example 1:

    Input:
    height = [0,1,0,2,1,0,1,3,2,1,2,1]

    Output:
    6

    Explanation:

    The elevation map traps a total of 6 units of water.

    --------------------------------------------------

    Example 2:

    Input:
    height = [4,2,0,3,2,5]

    Output:
    9

    --------------------------------------------------

    Constraints:

    1 <= height.length <= 2 * 10^4

    0 <= height[i] <= 10^5

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

    public int trap(int[] height) {
        // Your code here

        int [] leftMax = new int[height.length];
        leftMax[0] = height[0];

        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        int [] rightMax = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];

        for(int i=height.length-2;i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        int water = 0;
        for(int i=0;i<height.length;i++){
            water += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return water;
    }

    public static void main(String[] args) {
        Q13_TrappingRainWater q = new Q13_TrappingRainWater();
        System.out.println(q.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}