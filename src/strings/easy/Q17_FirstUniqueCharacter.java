package strings.easy;

import java.util.HashMap;
import java.util.Map;

public class Q17_FirstUniqueCharacter {

    /*
    Q17 - First Unique Character in a String

    Difficulty:
    Easy

    Pattern / Algorithm:
    // You identify this

    Problem:

    Given a string s, find the first character that appears
    exactly once in the string.

    Return the index of that character.

    If no such character exists, return -1.

    --------------------------------------------------

    Example 1:

    Input:
    s = "leetcode"

    Output:
    0

    Explanation:
    'l' appears only once and is the first unique character.

    --------------------------------------------------

    Example 2:

    Input:
    s = "loveleetcode"

    Output:
    2

    Explanation:
    'v' is the first character that appears only once.

    --------------------------------------------------

    Example 3:

    Input:
    s = "aabb"

    Output:
    -1

    --------------------------------------------------

    Constraints:

    1 <= s.length <= 100000

    s consists of lowercase English letters.

    --------------------------------------------------

    Follow-up:

    Can you solve it in O(n) time?

    Can you solve it with O(1) extra space?

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

    public int firstUniqChar(String s) {
        // Your code here
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Q17_FirstUniqueCharacter f = new Q17_FirstUniqueCharacter();
        System.out.println(f.firstUniqChar("loveleetcode"));
    }
}