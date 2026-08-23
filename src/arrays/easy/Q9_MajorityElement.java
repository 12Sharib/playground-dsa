package arrays.easy;

public class Q9_MajorityElement {

    /*
    Q9 - Majority Element

    Difficulty:
    Easy

    Problem:

    Given an integer array nums of size n, return the majority element.

    The majority element is the element that appears more than
    floor(n / 2) times.

    You may assume that the majority element always exists.

    --------------------------------------------------

    Example 1:

    Input:
    nums = [3,2,3]

    Output:
    3

    --------------------------------------------------

    Example 2:

    Input:
    nums = [2,2,1,1,1,2,2]

    Output:
    2

    --------------------------------------------------

    Constraints:

    1 <= nums.length <= 50000

    -10^9 <= nums[i] <= 10^9

    --------------------------------------------------

    Follow-up:

    Can you solve it in O(n) time and O(1) space?

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

    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if(count == 0){
                candidate = num;
                count++;
            } else if (candidate == num) {
                count++;
            }else {
                count--;
            }
        }

        System.out.println(candidate);
        return 0;
    }

    public static void main(String[] args) {
        Q9_MajorityElement majorityElement = new Q9_MajorityElement();
        majorityElement.majorityElement(new int[]{1,1,1,1,1,2,2});
    }
}