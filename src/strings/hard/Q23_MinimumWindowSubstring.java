package strings.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q23_MinimumWindowSubstring {

    /*
    Q23 - Minimum Window Substring

    Difficulty:
    Hard

    Pattern / Algorithm:
    // You identify this

    Problem:

    Given two strings s and t, return the shortest substring
    of s that contains every character from t, including
    duplicate characters.

    If no such substring exists, return "".

    --------------------------------------------------

    Example 1:

    Input:
    s = "ADOBECODEBANC"
    t = "ABC"

    Output:
    "BANC"

    Explanation:
    "BANC" is the shortest substring of s that contains
    'A', 'B', and 'C'.

    --------------------------------------------------

    Example 2:

    Input:
    s = "a"
    t = "a"

    Output:
    "a"

    --------------------------------------------------

    Example 3:

    Input:
    s = "a"
    t = "aa"

    Output:
    ""

    Explanation:
    The string s does not contain two 'a' characters.

    --------------------------------------------------

    Example 4:

    Input:
    s = "aa"
    t = "aa"

    Output:
    "aa"

    --------------------------------------------------

    Constraints:

    1 <= s.length <= 100000
    1 <= t.length <= 100000

    s and t consist of uppercase and lowercase English letters.

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

    public String minWindow(String s, String t) {
        // Your code here

        if (s.length() < t.length()) return "";


        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }

        int count = 0;
        int min = Integer.MAX_VALUE;
        int startIndex = 0;
        int start = 0;
        int end = 0;

        while (end < s.length()) {
            char c = s.charAt(end);
            if(map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) >= 0) {
                    count++;
                }
            }

            while (count == t.length()) {
                if(end - start + 1 < min) {
                    min = end - start + 1;
                    startIndex = start;
                }
                char l = s.charAt(start);
                if (map.containsKey(l)) {
                    map.put(l, map.get(l) + 1);
                    if (map.get(l) > 0) {
                        count--;
                    }
                }
                start++;
            }
            end++;
        }



        System.out.println(s.substring(startIndex, startIndex + min));
        return "";
    }

    public static void main(String[] args) {
        Q23_MinimumWindowSubstring q = new Q23_MinimumWindowSubstring();
        System.out.println(q.minWindow("ADOBECODEBANC", "ABC"));
    }
}