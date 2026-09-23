package stack.medium;

import java.util.Stack;

public class Q24_EvaluateReversePolishNotation {

    /*
    Q24 - Evaluate Reverse Polish Notation

    Difficulty:
    Medium

    Pattern / Algorithm:
    // You identify this

    Problem:

    You are given an array of strings tokens that represents
    an arithmetic expression in Reverse Polish Notation.

    Evaluate the expression and return the integer result.

    Valid operators are:

    +, -, *, /

    Each operand may be an integer or another expression.

    Division between two integers should truncate toward zero.

    --------------------------------------------------

    Example 1:

    Input:
    tokens = ["2", "1", "+", "3", "*"]

    Output:
    9

    Explanation:

    ((2 + 1) * 3) = 9

    --------------------------------------------------

    Example 2:

    Input:
    tokens = ["4", "13", "5", "/", "+"]

    Output:
    6

    Explanation:

    4 + (13 / 5) = 6

    --------------------------------------------------

    Example 3:

    Input:
    tokens = ["10", "6", "9", "3", "+", "-11",
              "*", "/", "*", "17", "+", "5", "+"]

    Output:
    22

    --------------------------------------------------

    Example 4:

    Input:
    tokens = ["3", "4", "+", "2", "*", "7", "/"]

    Output:
    2

    --------------------------------------------------

    Constraints:

    1 <= tokens.length <= 10^4

    tokens[i] is either an integer or one of:
    "+", "-", "*", "/"

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

    public int evalRPN(String[] tokens) {
        // Your code here

        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(num1 + num2);
                        break;
                    case  "-":
                        stack.push(num2 - num1);
                        break;
                    case "*":
                        stack.push(num1 * num2);
                        break;
                    case  "/":
                        stack.push(num2 / num1);
                        break;
                }
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        System.out.println(stack);
        return 0;
    }

    public static void main(String[] args) {
        Q24_EvaluateReversePolishNotation eval = new Q24_EvaluateReversePolishNotation();
        System.out.println(eval.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11",
                "*", "/", "*", "17", "+", "5", "+"}));
    }
}