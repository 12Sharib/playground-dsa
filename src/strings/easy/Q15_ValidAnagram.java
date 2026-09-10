package strings.easy;

import java.util.HashMap;
import java.util.Map;

public class Q15_ValidAnagram {

    /*
    Q15 - Valid Anagram

    Difficulty:
    Easy

    Pattern / Algorithm:
    // You identify this

    Problem:

    Given two strings s and t, return true if t is an anagram of s,
    and false otherwise.

    An anagram is a string formed by rearranging the letters of
    another string.

    In other words, both strings must contain the same characters
    with the same frequencies.

    --------------------------------------------------

    Example 1:

    Input:
    s = "anagram"
    t = "nagaram"

    Output:
    true

    --------------------------------------------------

    Example 2:

    Input:
    s = "rat"
    t = "car"

    Output:
    false

    --------------------------------------------------

    Example 3:

    Input:
    s = "aacc"
    t = "ccac"

    Output:
    false

    --------------------------------------------------

    Constraints:

    1 <= s.length, t.length <= 50000

    s and t consist of lowercase English letters.

    --------------------------------------------------

    Follow-up:

    Can you solve it in O(n) time?

    Can you solve it without sorting?

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

    public boolean isAnagram(String s, String t) {
        // Your code here
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
            } else {
                return false;
            }
        }
        for(Map.Entry<Character, Integer> entry:map.entrySet()){
            if(entry.getValue() != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Q15_ValidAnagram q = new Q15_ValidAnagram();
        System.out.println(q.isAnagram("aacc", "aac"));
    }
}