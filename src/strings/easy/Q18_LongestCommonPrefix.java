package strings.easy;

public class Q18_LongestCommonPrefix {

    /*
    Q18 - Longest Common Prefix

    Difficulty:
    Easy

    Pattern / Algorithm:
    // You identify this

    Problem:

    Write a function to find the longest common prefix string
    amongst an array of strings.

    If there is no common prefix, return an empty string "".

    --------------------------------------------------

    Example 1:

    Input:
    strs = ["flower", "flow", "flight"]

    Output:
    "fl"

    --------------------------------------------------

    Example 2:

    Input:
    strs = ["dog", "racecar", "car"]

    Output:
    ""

    Explanation:
    There is no common prefix among the input strings.

    --------------------------------------------------

    Example 3:

    Input:
    strs = ["interspecies", "interstellar", "interstate"]

    Output:
    "inters"

    --------------------------------------------------

    Constraints:

    1 <= strs.length <= 200

    0 <= strs[i].length <= 200

    strs[i] consists of lowercase English letters.

    --------------------------------------------------

    Follow-up:

    Can you solve it efficiently without comparing every
    possible substring?

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

    public String longestCommonPrefix(String[] strs) {
        // Your code here
        String prefix = strs[0];

        int index = 1;
        while(index < strs.length){
            int subindex = 0;

            while (subindex < strs[index].length() && subindex < prefix.length()
            && strs[index].charAt(subindex) == prefix.charAt(subindex)){
                subindex++;
            }
            prefix = prefix.substring(0, subindex);
            index++;
        }
        return prefix;
    }

    public static void main(String[] args) {
        Q18_LongestCommonPrefix q = new Q18_LongestCommonPrefix();
        System.out.println(q.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
}