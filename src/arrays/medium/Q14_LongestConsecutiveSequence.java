package arrays.medium;

import java.util.HashSet;

public class Q14_LongestConsecutiveSequence {

    /*
    Q14 - Longest Consecutive Sequence

    Difficulty:
    Medium

    Problem:

    Given an unsorted integer array nums,
    return the length of the longest consecutive elements sequence.

    You must write an algorithm that runs in O(n) time.

    --------------------------------------------------

    Example 1:

    Input:
    nums = [100,4,200,1,3,2]

    Output:
    4

    Explanation:

    The longest consecutive sequence is:
    [1,2,3,4]

    Therefore, return 4.

    --------------------------------------------------

    Example 2:

    Input:
    nums = [0,3,7,2,5,8,4,6,0,1]

    Output:
    9

    --------------------------------------------------

    Constraints:

    0 <= nums.length <= 100000

    -10^9 <= nums[i] <= 10^9

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

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        int res = 0;
        for (int num : set) {
            int current = num;
            int count = 1;

            if (!set.contains(current-1)) {
                while (set.contains(current+1)) {
                    current++;
                    count++;
                }
                res = Math.max(res, count);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Q14_LongestConsecutiveSequence q = new Q14_LongestConsecutiveSequence();
        System.out.println(q.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
    }
}