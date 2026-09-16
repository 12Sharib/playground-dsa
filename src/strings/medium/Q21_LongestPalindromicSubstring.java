package strings.medium;

public class Q21_LongestPalindromicSubstring {

    /*
    Q21 - Longest Palindromic Substring

    Difficulty:
    Medium

    Pattern / Algorithm:
    // You identify this

    Problem:

    Given a string s, return the longest palindromic substring
    in s.

    A palindrome reads the same forward and backward.

    A substring must be contiguous.

    If there are multiple answers with the same maximum length,
    return any one of them.

    --------------------------------------------------

    Example 1:

    Input:
    s = "babad"

    Output:
    "bab"

    Explanation:
    "aba" is also a valid answer.

    --------------------------------------------------

    Example 2:

    Input:
    s = "cbbd"

    Output:
    "bb"

    --------------------------------------------------

    Example 3:

    Input:
    s = "a"

    Output:
    "a"

    --------------------------------------------------

    Example 4:

    Input:
    s = "ac"

    Output:
    "a"

    --------------------------------------------------

    Constraints:

    1 <= s.length <= 1000

    s consists of lowercase English letters.

    --------------------------------------------------

    Follow-up:

    Can you solve it in O(n²) time?

    Can you avoid generating every possible substring explicitly?

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

    public String longestPalindrome(String s) {
        // Your code here

        String longestStr = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                boolean isPalindrome = true;

                int k=i;
                int z=j;
                while( k<z){
                    if(s.charAt(k)!=s.charAt(z)){
                        isPalindrome = false;
                        break;
                    }else{
                        k++;
                        z--;
                    }
                }
                if(isPalindrome && (j-i+1>longestStr.length())) {
                        longestStr = s.substring(i, j+1);

                }
            }

        }
        System.out.println(longestStr);
        return "";
    }

    public static void main(String[] args) {
        Q21_LongestPalindromicSubstring l = new Q21_LongestPalindromicSubstring();
        System.out.println(l.longestPalindrome("a"));
    }
}