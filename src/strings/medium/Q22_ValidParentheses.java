package strings.medium;

import java.util.Stack;

public class Q22_ValidParentheses {

    /*
    Q22 - Valid Parentheses

    Difficulty:
    Medium

    Pattern / Algorithm:
    // You identify this

    Problem:

    Given a string s containing only the characters
    '(', ')', '{', '}', '[' and ']',
    determine if the input string is valid.

    A string is valid if:

    1. Every opening bracket has a corresponding closing bracket
       of the same type.

    2. Brackets are closed in the correct order.

    --------------------------------------------------

    Example 1:

    Input:
    s = "()"

    Output:
    true

    --------------------------------------------------

    Example 2:

    Input:
    s = "()[]{}"

    Output:
    true

    --------------------------------------------------

    Example 3:

    Input:
    s = "(]"

    Output:
    false

    --------------------------------------------------

    Example 4:

    Input:
    s = "([{}])"

    Output:
    true

    --------------------------------------------------

    Example 5:

    Input:
    s = "([)]"

    Output:
    false

    Explanation:

    The brackets are not closed in the correct order.

    --------------------------------------------------

    Example 6:

    Input:
    s = "]"

    Output:
    false

    --------------------------------------------------

    Constraints:

    1 <= s.length <= 10000

    s consists only of '(', ')', '{', '}', '[' and ']'.

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

    public boolean isValid(String s) {
        // Your code here
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }else if(s.charAt(i) == ')' && stack.peek() == '(' && !stack.isEmpty()){
                stack.pop();
            }else if(s.charAt(i) == '}' && stack.peek() == '{' && !stack.isEmpty()){
                stack.pop();
            }else if(s.charAt(i) == ']' && stack.peek() == '[' && !stack.isEmpty()){
                stack.pop();
            }else {
                return false;
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Q22_ValidParentheses q = new Q22_ValidParentheses();
        System.out.println(q.isValid("([{}])"));
    }
}