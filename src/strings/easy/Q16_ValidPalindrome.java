package strings.easy;

public class Q16_ValidPalindrome {

    /*
    Q16 - Valid Palindrome

    Difficulty:
    Easy

    Pattern / Algorithm:
    // You identify this

    Problem:

    Given a string s, return true if it is a palindrome,
    or false otherwise.

    A palindrome is a string that reads the same forward
    and backward.

    For this problem:
    - Ignore cases.
    - Ignore all non-alphanumeric characters.

    --------------------------------------------------

    Example 1:

    Input:
    s = "A man, a plan, a canal: Panama"

    Output:
    true

    Explanation:
    After removing non-alphanumeric characters and ignoring case:

    "amanaplanacanalpanama"

    which is a palindrome.

    --------------------------------------------------

    Example 2:

    Input:
    s = "race a car"

    Output:
    false

    --------------------------------------------------

    Example 3:

    Input:
    s = " "

    Output:
    true

    --------------------------------------------------

    Constraints:

    1 <= s.length <= 2 * 10^5

    s consists only of printable ASCII characters.

    --------------------------------------------------

    Follow-up:

    Can you solve it in O(n) time?

    Can you solve it using O(1) extra space?

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

    public boolean isPalindrome(String s) {
        // Your code here
//        String result2 = s.replaceAll("[^a-zA-Z0-9]", "");
       String value = s.toLowerCase();

        int start = 0;
        int end = value.length() - 1;

        while (start<end){
            if (Character.isLetterOrDigit(value.charAt(start)) && Character.isLetterOrDigit(value.charAt(end))) {
                if (value.charAt(start) != value.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }else if(!Character.isLetterOrDigit(value.charAt(start))){
                start++;
            }else if(!Character.isLetterOrDigit(value.charAt(end))){
                end--;
            }else {
                start++;
                end--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Q16_ValidPalindrome q = new Q16_ValidPalindrome();
        System.out.println(q.isPalindrome("race a car"));
    }
}