package arrays.medium;

public class Q12_ContainerWithMostWater {

    /*
    Q12 - Container With Most Water

    Difficulty:
    Medium

    Problem:

    You are given an integer array height of length n.
    There are n vertical lines drawn such that the two endpoints
    of the ith line are (i, 0) and (i, height[i]).

    Find two lines that together with the x-axis form a container
    such that the container contains the maximum amount of water.

    Return the maximum amount of water a container can store.

    Note:
    You may not slant the container.

    --------------------------------------------------

    Example 1:

    Input:
    height = [1,8,6,2,5,4,8,3,7]

    Output:
    49

    Explanation:
    The maximum area is formed between heights 8 and 7,
    with width 7.

    --------------------------------------------------

    Example 2:

    Input:
    height = [1,1]

    Output:
    1

    --------------------------------------------------

    Constraints:

    2 <= height.length <= 100000

    0 <= height[i] <= 10000

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

    public void maxArea(int[] height) {
        // Your code here
        int left = 0;
        int right = height.length - 1;

        int maxArea = 0;
        while (left < right) {
            if(height[left] < height[right]) {
                maxArea = Math.max(maxArea, height[left] * (right - left));
                left++;
            }else {
                maxArea = Math.max(maxArea, height[right] * (right - left));
                right--;
            }
        }
        System.out.println(maxArea);
    }

    public static void main(String[] args) {
        Q12_ContainerWithMostWater q = new Q12_ContainerWithMostWater();
        q.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
    }
}