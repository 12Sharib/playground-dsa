package strings.medium;

import java.util.*;

public class Q20_GroupAnagrams {

    /*
    Q20 - Group Anagrams

    Difficulty:
    Medium

    Pattern / Algorithm:
    // You identify this

    Problem:

    Given an array of strings, group the anagrams together.

    You may return the groups in any order.

    Two strings are anagrams if they contain the same characters
    with the same frequencies.

    --------------------------------------------------

    Example 1:

    Input:
    strs = ["eat", "tea", "tan", "ate", "nat", "bat"]

    Output:
    [
        ["bat"],
        ["nat", "tan"],
        ["ate", "eat", "tea"]
    ]

    --------------------------------------------------

    Example 2:

    Input:
    strs = [""]

    Output:
    [
        [""]
    ]

    --------------------------------------------------

    Example 3:

    Input:
    strs = ["a"]

    Output:
    [
        ["a"]
    ]

    --------------------------------------------------

    Constraints:

    1 <= strs.length <= 10000

    0 <= strs[i].length <= 100

    strs[i] consists of lowercase English letters.

    --------------------------------------------------

    Follow-up:

    Can you solve it in O(n * k) time, where k is the
    maximum length of a string?

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

    public List<List<String>> groupAnagrams(String[] strs) {
        // Your code here

        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);

            if(!map.containsKey(String.valueOf(arr))){
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(String.valueOf(arr), list);
            }else {
                map.get(String.valueOf(arr)).add(str);
            }

        }
        List<List<String>>  res = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry: map.entrySet()){
            res.add(entry.getValue());
        }
        return res;
    }

    public static void main(String[] args) {
        Q20_GroupAnagrams q = new Q20_GroupAnagrams();

        System.out.println(q.groupAnagrams(new String[]{"a"}));
    }
}