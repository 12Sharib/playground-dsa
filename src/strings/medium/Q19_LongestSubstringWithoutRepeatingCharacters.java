package strings.medium;

import java.util.HashMap;
import java.util.Map;

public class Q19_LongestSubstringWithoutRepeatingCharacters {

    /*
    Q19 - Longest Substring Without Repeating Characters

    Difficulty:
    Medium

    Pattern / Algorithm:
    // You identify this

    Problem:

    Given a string s, find the length of the longest substring
    without repeating characters.

    A substring is a contiguous sequence of characters.

    --------------------------------------------------

    Example 1:

    Input:
    s = "abcabcbb"

    Output:
    3

    Explanation:
    The answer is "abc", with length 3.

    --------------------------------------------------

    Example 2:

    Input:
    s = "bbbbb"

    Output:
    1

    Explanation:
    The answer is "b", with length 1.

    --------------------------------------------------

    Example 3:

    Input:
    s = "pwwkew"

    Output:
    3

    Explanation:
    The answer is "wke", with length 3.

    Note:
    "pwke" is not a substring because it is not contiguous.

    --------------------------------------------------

    Example 4:

    Input:
    s = ""

    Output:
    0

    --------------------------------------------------

    Constraints:

    0 <= s.length <= 50000

    s consists of English letters, digits, symbols and spaces.

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

    public int lengthOfLongestSubstring(String s) {
        // Your code here
        Map<Character, Integer> map = new HashMap<>();
//        abcabcbb
        // abba

        int max = 0;
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }
            map.put(c, right);
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }

    public static void main(String[] args) {
        Q19_LongestSubstringWithoutRepeatingCharacters q = new Q19_LongestSubstringWithoutRepeatingCharacters();
        System.out.println(q.lengthOfLongestSubstring("eea"));
    }
}